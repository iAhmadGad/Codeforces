use std::io::{self, Write};
use std::cmp::max;

fn main()
{
    let vector = read_i16_vector();
    let mut dp = vec![0; (vector[0] + 1) as usize];
    println!("{}", solve(&mut dp, vector[1], vector[2], vector[3], vector[0]));
}

fn solve(dp: &mut [i16], a: i16, b: i16, c: i16, i: i16) -> i16
{
    if i < 0
    {
        return i16::MIN;
    }
    
    if dp[i as usize] != 0 || i == 0
    {
        return dp[i as usize];
    }
    else
    {
        dp[i as usize] = 1 + max(solve(dp, a, b, c, i - a), max(solve(dp, a, b, c, i - b), solve(dp, a, b, c, i - c)));
        return dp[i as usize];
    }
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
    let splitted_input = input.split_whitespace();
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
