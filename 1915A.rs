fn main()
{
    let mut t = read_i16();
    while t > 0
    {
	let [a, b, c] = {let mut vec = read_i16_vector(); vec.sort(); vec}[..] else {panic!("Error parsing a, b & c")};
	println!("{}", if a == b {c} else {a});
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

fn read_i16_vector() -> Vec<i16>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i16")).collect()
}
