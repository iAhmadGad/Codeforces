fn main()
{
    let mut n = read_i16();
    let mut mishka = 0;
    let mut chris = 0;
    while n > 0
    {
	let [m, c] = read_i16_vector()[..] else { panic!("Error parsing m & c") };
	mishka += (m > c) as i16;
	chris += (c > m) as i16;
	n -= 1;
    }
    println!("{}", if mishka > chris { "Mishka" } else if chris > mishka { "Chris"  } else { "Friendship is magic!^^" });
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i16() -> i16 
{
    read_line().trim().parse().expect("Not i16")
}

fn read_i16_vector() -> Vec<i16>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i16")).collect()
}
