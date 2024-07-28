fn main()
{
    let [_n, t] = read_i16_vector()[..] else {panic!("Error parsing n & t")};
    let a = read_i16_vector();
    let mut cell = 1;
    while cell < t
    {
	cell += a[cell as usize - 1];
    }
    println!("{}", if cell == t {"YES"} else {"NO"});
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i16_vector() -> Vec<i16>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i16")).collect()
}
