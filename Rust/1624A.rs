fn main()
{
    let mut t = read_i16();
    while t > 0
    {
	let _n = read_i8();
	let a = read_i32_vector();
	println!("{}", a.iter().max().unwrap() - a.iter().min().unwrap());
	t -= 1;
    }
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i8() -> i8
{
    read_line().trim().parse().expect("Not i8")
}

fn read_i16() -> i16 
{
    read_line().trim().parse().expect("Not i16")
}

fn read_i32_vector() -> Vec<i32>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i32")).collect()
}
