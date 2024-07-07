use std::io::{self, Write};
use std::cmp::min;

fn main()
{
    let vector = read_i16_vector();
    println!("{}", if min(vector[0], vector[1]) % 2 == 0 {"Malvika"} else {"Akshat"}) 
}

fn read_line() -> String
{
    io::stdout().flush().unwrap();
    let mut ret = String::new();
    io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
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
            Err(_) => panic!("Not i16")
        }
    }
    vector
}
