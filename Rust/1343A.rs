fn main()
{
    let mut t = read_i16();
    while t > 0
    {
	t -= 1;
	let n = read_i32();
	if n % 4 != 0
	{
	    println!("NO");
	    continue;
	}
	println!("YES");
	let mut even_sum = 0;
	for i in (2..=n).step_by(2)
	{
	    print!("{} ", i);
	    even_sum += i;
	}
	let mut odd_sum = 0;
	for i in (1..n-1).step_by(2)
	{
	    print!("{} ", i);
	    odd_sum += i;
	}
	println!("{}", even_sum - odd_sum);
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

fn read_i32() -> i32
{
    read_line().trim().parse().expect("Not i32")
}
