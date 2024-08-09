use std::io::{self, Write};

fn main()
{
    let codeforces = ["c", "o", "d", "e", "f", "r", "s"];
    let mut t = read_i16();
    while t > 0
    {
	let letter = read_line();
	println!("{}", if codeforces.contains(&letter.as_str()) {"YES"} else {"NO"});
	t -= 1;
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
