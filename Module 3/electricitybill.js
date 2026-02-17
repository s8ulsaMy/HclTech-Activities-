// Input
let billNumber = prompt("Enter Bill Number:");
let creditCard = prompt("Enter Credit Card Number:");
let billAmount = parseFloat(prompt("Enter Bill Amount (Rs):"));
let paymentDate = parseInt(prompt("Enter Payment Date (1-31):"));

// Fine calculation
let fine = 0;

if (paymentDate > 15) {
    fine = (paymentDate - 15) * 50;
}

// Final amount
let finalBill = billAmount + fine;

// Output
alert(
    "Bill Number: " + billNumber +
    "\nCredit Card: " + creditCard +
    "\nOriginal Bill: Rs." + billAmount +
    "\nFine: Rs." + fine +
    "\nFinal Bill: Rs." + finalBill
);
