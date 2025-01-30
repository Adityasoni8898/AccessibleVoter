# AccessibleVoter - Inclusive Voting App
This app is designed to make voting accessible for people with different disabilities. It provides various interaction methods to accommodate users’ needs and ensures secure and private voting. The app handles everything from voter registration to vote submission in a user-friendly and inclusive manner.
A hackathon project designed to make voting accessible for people with disabilities.

## Features

- **Inclusive Voting Process**: Designed to support users with visual, motor, and other disabilities.  
- **Simple Three-Step Voting**:  
  1. **KYC Verification** – Users verify their identity through an image-based KYC process.  
  2. **Vote Selection** – Users securely select their candidate.  
  3. **QR-Based Submission** – A secure QR code is generated to store the vote.  
- **Secure QR Code Generation**: Utilizes the `QRGenerator` library for encoding vote data.  
- **Image-Based KYC**: Captures user photos with camera access permissions for verification.  

## Tech Stack

- **Frontend**: Android (Kotlin, XML)  
- **Backend**: Python (FastAPI)  
- **Security**: Secure QR Code Storage  
- **Libraries Used**:  
  - `QRGenerator` for QR code creation  