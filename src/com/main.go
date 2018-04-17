package main

import (
	"fmt"
	"os/exec"
)

func command(className string, functionName string) (string, error) {
	out, err := exec.Command("/usr/bin/java", "com.Hello", className, functionName).Output()
	if err != nil {
		return "", err
	}

	return string(out), nil
}

func main() {
	say, err := command("Talk", "hi")
	if err != nil {
		fmt.Println("command: ", err)
		return
	}
	fmt.Println(say)
}
