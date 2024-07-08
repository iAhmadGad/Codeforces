fn main()
{
    let [n, m] = read_u8_vector()[..] else {panic!("Error parsing m & n")};
    for i in n+1..
    {
	if is_prime(i)
	{
	    println!("{}", if i == m {"YES"} else {"NO"});
	    break;
	}
    }
}

fn is_prime(i: u8) -> bool
{
    let mut j = 2;
    while j * j <= i
    {
	if i % j == 0
	{
	    return false;
	}
	j += 1;
    }
    return true;
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_u8_vector() -> Vec<u8>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not u8")).collect()
}
