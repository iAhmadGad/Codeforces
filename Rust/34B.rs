fn main()
{
    let [_n, m] = read_i32_vector()[..] else {panic!("Error parsing n & m");};
    let a = {
	let mut vector = read_i32_vector();
	vector.sort();
	vector
    };
    let mut sum = 0;
    for i in 0..m as usize
    {
	if a[i] >= 0
	{
	    break;
	}
	sum -= a[i];
    }
    println!("{}", sum);
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
