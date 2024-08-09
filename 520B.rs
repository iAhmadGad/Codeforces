fn main()
{
    let [n, mut m] = read_i32_vector()[..] else {unreachable!()};
    let mut count = 0;
    while n != m
    {
	if m % 2 == 0 && m > n
	{
	    m /= 2;
	}
	else
	{
	    m += 1;
	}
	count += 1;
    }
    println!("{count}");
}

fn read_line() -> String
{
    let mut input = String::new();
    std::io::stdin().read_line(&mut input).expect("Failed to read from stdin");
    input.trim().to_string()
}

fn read_i32_vector() -> Vec<i32>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i32")).collect()
}
