// Test mit cargo test
// Wie jUnit in Java

pub fn verdopple_zahlen(zahlen: Vec<i32>) -> Vec<i32> {
    zahlen.iter().map(|&x| x * 2).collect()
}

fn main() {
    let zahlen = vec![2, 2, 3, 4, 5];
    let verdoppelte_zahlen = verdopple_zahlen(zahlen);
    println!("{:?}", verdoppelte_zahlen);
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_verdopple_zahlen() {
        let zahlen = vec![2, 2, 3, 4, 5];
        let erwartete_verdoppelte_zahlen = vec![2, 4, 6, 8, 10];
        assert_eq!(verdopple_zahlen(zahlen), erwartete_verdoppelte_zahlen);
    }
}

//mod = Module... kapseln Funktionalitäten und gliedern Code
// in separate Namensräume
