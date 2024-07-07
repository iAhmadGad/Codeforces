use std::io::{self, Write};

fn main()
{
    let mut code = read_line();
    code = code.replace("--", "2");
    code = code.replace("-.", "1");
    code = code.replace(".", "0");
    println!("{}", code);
}

fn read_line() -> String
{
    io::stdout().flush().unwrap();
    let mut ret = String::new();
    io::stdin().read_line(&mut ret).expect("Failed to read from stdin");
    ret.trim().to_string()
}
