fn main()
{
    let [n, t] = read_i32_vector()[..] else {panic!("Error parsing n & t")};
    let a = read_i32_vector();
    let (mut start, mut end, mut current_sum, mut max_books_count) = (0, 0, 0, 0);
    while end < n
    {
	current_sum += a[end as usize];
	while current_sum > t
	{
	    current_sum -= a[start as usize];
	    start += 1;
	}
	max_books_count = std::cmp::max(max_books_count, end - start + 1);
	end += 1;
    }
    println!("{}", max_books_count);
}

fn read_line() -> String
{
    let mut ret = String::new();
    std::io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}

fn read_i32_vector() -> Vec<i32>
{
    read_line().split_whitespace().map(|s| s.trim().parse().expect("Not i32")).collect()
}
