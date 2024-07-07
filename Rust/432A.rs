use std::io::{self, Write};

fn main()
{
    let [_n, k] = read_i16_vector()[..] else {panic!("Error when parsing n & k")};
    let vec = read_i16_vector();
    let mut counter = 0;
    for y in vec.iter()
    {
	counter += i16::from(y + k <= 5);
    }
    println!("{}", (counter / 3) as i16)
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
