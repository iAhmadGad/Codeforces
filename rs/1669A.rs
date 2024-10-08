use std::io::{self, Write};

fn main()
{
    let mut t = read_i16();
    while t > 0
    {
	solve();
	t -= 1;
    }
}

fn solve()
{
    let rating = read_i16();
    match rating
    {
	r if r >= 1900 => println!("Division 1"),
	r if r >= 1600 => println!("Division 2"),
	r if r >= 1400 => println!("Division 3"),
	_ => println!("Division 4")
    }
}

fn read_line() -> String
{
    io::stdout().flush().unwrap();
    let mut ret = String::new();
    io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i16() -> i16
{
    let input = read_line();
    match input.trim().parse::<i16>()
    {
        Ok(num) => return num,
        Err(_) => panic!("Not i16")
    }
}
