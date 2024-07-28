/*
 * A - Odd Divisor
 */

use std::io::{self, Write};

fn main()
{
    let mut t = read_u16();
    while t > 0
    {
	solve();
	t -= 1;
    }
}

fn solve()
{
    let n = read_u64();
    println!("{}", if n & (n - 1) != 0 {"YES"} else {"NO"})
}

fn read() -> String
{
    io::stdout().flush().unwrap();
    let mut ret = String::new();
    io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_with_message(message: &str) -> String
{
    print!("{}", message);
    io::stdout().flush().unwrap();
    let mut ret = String::new();
    io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i32() -> i32
{
    let input = read();
    match input.trim().parse::<i32>()
    {
        Ok(num) => return num,
        Err(_) => panic!("Not i32")
    }
}


fn read_i32_with_message(message: &str) -> i32
{
    let input = read_with_message(message);
    match input.trim().parse::<i32>()
    {
        Ok(num) => return num,
        Err(_) => panic!("Not i32")
    }
}

fn read_u16() -> u16
{
    let input = read();
    match input.trim().parse::<u16>()
    {
        Ok(num) => return num,
        Err(_) => panic!("Not u16")
    }
}

fn read_u64() -> u64
{
    let input = read();
    match input.trim().parse::<u64>()
    {
        Ok(num) => return num,
        Err(_) => panic!("Not u64")
    }
}

