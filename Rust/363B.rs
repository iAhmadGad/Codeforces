fn main()
{
    let [n, k] = read_i32_vector()[..] else {panic!("Error parsing n & k")};
    let h = read_i32_vector();
    let mut sum: i32 = h[..k as usize].iter().sum();
    let (mut min_sum, mut min_index) = (sum, 0);
    for i in 1..n - k + 1
    {
	sum = sum - h[(i - 1) as usize] + h[(i + k - 1) as usize];
	if sum < min_sum
	{
	    min_sum = sum;
	    min_index = i;
	}
    }
    println!("{}", min_index + 1);
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i32_vector() -> Vec<i32>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i32")).collect()
}
