function printWords(str) {
 let result;
        let lines = str.split("\n");
    for (let i = 0; i < lines.length; i++) {
        let words = lines[i].split(" ");
         
        for (let j = 0; j < words.length; j++) {
            result = words[j].split("").reverse().join("");
            process.stdout.write(result + " ");
        }
    }
}
 let s = "Hello! have a nice day";
printWords(s);