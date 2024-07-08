fn main()
{
    let mut t = read_i16();
    while t > 0
    {
	let [n, k] = read_i32_vector()[..] else {panic!("Error  parsing n & k")};
	println!("{}", k + (k - 1) / (n - 1));
	t -= 1;
    }
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i16() -> i16 
{
    read_line().trim().parse().expect("Not i16")
}

fn read_i32_vector() -> Vec<i32>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i32")).collect()
}
