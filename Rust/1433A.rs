fn main()
{
    let mut t = read_u32();

    while t > 0
    {
	let x = read_u32();
	println!("{}", (x / 10u32.pow(x.ilog10()) - 1) * 10 + triangular_number(x.ilog10() + 1));
	t -= 1;
    }
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_u32() -> u32 
{
    read_line().trim().parse().expect("Not u32")
}

fn triangular_number(n: u32) -> u32
{
    if n == 1
    {
	return 1;
    }

    return n + triangular_number(n - 1);
}

