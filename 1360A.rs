use std::io::{self, Write};
use std::cmp::{max, min};

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
    let ab = read_i16_vector();
    let length = max(ab[0], ab[1]);
    let width = min(ab[0], ab[1]);
    println!("{}", i32::from(max(width * 2, length)).pow(2));
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
        Err(_) => panic!("Not i32")
    }
}

fn read_i16_vector() -> Vec<i16>
{
    let mut vector: Vec<i16> = Vec::new();
    let input = read_line();
    let splitted_input = input.split(" ");
    for s in splitted_input
    {
        match s.trim().parse::<i16>()
        {
            Ok(int) => vector.push(int),
            Err(_) => panic!("Not i32")
        }
    }
    vector
}
