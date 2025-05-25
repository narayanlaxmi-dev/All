// app passowrd create  vyzp knlc wvom kqpc
const nodemailer = require("nodemailer");

// Create a test account or replace with real credentials.
const transporter = nodemailer.createTransport({
//   host: "smtp.ethereal.email",
//   port: 587,
    secure: false, // true for 465, false for other ports
    service:'gmail',
  auth: {
    user: "narayanlaxmipatil@gmail.com",
    pass: "vyzp knlc wvom kqpc",
  },
});

// Wrap in an async IIFE so we can use await.
(async () => {
  const info = await transporter.sendMail({
    from: '"Narayan laxmi patil" <narayanlaxmipatil@gmail.com>',
    to: "komalarjunchavan@gmail.com, nitamhaske11@gmail.com",
    subject: "Hello MothiBen and Friends ✔",
    text: "Hello world, happy birthday advance?", // plain‑text body
    html: "<b>Hello world Wishes?</b>", // HTML body
  });

  console.log("Message sent:", info.messageId);
})();