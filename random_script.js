/**
 * A simple script to demonstrate random functionality.
 */

function generateRandomNumber(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

const minRange = 1;
const maxRange = 100;
const randomNumber = generateRandomNumber(minRange, maxRange);

console.log(`Generated a random number between ${minRange} and ${maxRange}: ${randomNumber}`);
console.log(`Current Time: ${new Date().toLocaleTimeString()}`);
