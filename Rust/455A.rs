use std::cmp::max;

fn main()
{
    let _n = read_i32();
    let vec = read_i32_vector();
    let max_value = *vec.iter().max().unwrap_or(&0) as usize;
    let frequency = get_frequency(&vec, max_value + 1);
    let mut dp: Vec<i128> = vec![0; max_value + 1];
    if max_value >= 1
	{
	    dp[1] = frequency[1] as i128;
	}
    for i in 2..=max_value
    {
	dp[i] = max(dp[i - 1], dp[i - 2] + i as i128 * frequency[i] as i128);
    }
    println!("{}", dp[max_value]);
}

fn get_frequency(vec: &Vec<i32>, size: usize) -> Vec<i32>
{
    let mut frequency = vec![0; size];
    for &i in vec.iter()
    {
	frequency[i as usize] += 1;
    }
    frequency
}

fn read_line() -> String
{
    std::io::Write::flush(&mut std::io::stdout()).unwrap();
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i32() -> i32
{
    read_line().trim().parse().expect("Not i32")
}

fn read_i32_vector() -> Vec<i32>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i32")).collect()
}
