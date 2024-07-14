fn main()
{
    let mut t = read_i32();
    while t > 0
    {
	let n = read_i32();
	println!("{}", n / 2);
	t -= 1;
    }
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i32() -> i32 
{
    read_line().trim().parse().expect("Not i32")
}

