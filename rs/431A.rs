fn main()
{
    let a = read_i16_vector();
    let s = read_line();
    let mut calories: i32 = 0; 
    for c in s.chars()
    {
	calories += a[c.to_digit(10).unwrap() as usize - 1] as i32;
    }
    println!("{}", calories);
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
