/*
 * A - Watermelon
 */

use std::io::{self, Write};

fn main()
{
    let i: i32 = read_i32();
    if i % 2 == 0 && i != 2
    {
	println!("YES");
    }
    else
    {
	println!("NO")
    }
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
