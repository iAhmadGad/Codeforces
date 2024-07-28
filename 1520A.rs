fn main()
{
    let mut t = read_i32();

    while t > 0
    {
	solve();
	t -= 1;
    }
}

fn solve()
{
    let _n = read_i32();
    let s = read_line();
    let mut vector = vec![s.chars().nth(0).unwrap()];
    for c in s.chars().skip(1)
    {
	if c != *vector.last().unwrap() && vector.contains(&c)
	{
	    println!("NO");
	    return;
	}
	vector.push(c);
    }
    println!("YES");
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
