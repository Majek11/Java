import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("""
        
        Select an option:
        1. 📞 Phonebook
        2. 💬 Messages
        3. 🗨️ Chat
        4. 📜 Call register
        5. 🎵 Tones
        6. ⚙️ Settings
        7. 📡 Call divert
        8. 🎮 Games
        9. 🧮 Calculator
        10. ⏰ Reminders
        11. 🕒 Clock
        12. 🎭 Profiles
        13. 📀 SIM services

        """);

        int choice = userInput.nextInt();

        switch (choice) {
            case 1:
                System.out.println("""
                📞 Phonebook:
                1. 🔍 Search
                2. 📋 Service Nos
                3. ➕ Add name
                4. ❌ Erase
                5. ✏️ Edit
                6. 🎶 Assign tone
                7. 📇 Send b'card
                8. ⚙️ Options
                9. 🔢 Speed dials
                10. 🗣️ Voice tags
                """);
                break;

            case 2:
                System.out.println("""
                💬 Messages:
                1. ✍️ Write messages
                2. 📥 Inbox
                3. 📤 Outbox
                4. 🖼️ Picture messages
                5. 📑 Templates
                6. 😀 Smileys
                7. ⚙️ Message settings
                8. ℹ️ Info service
                9. 📞 Voice mailbox number
                10. 💻 Service command editor
                """);
                break;

            case 3:
                System.out.println("🗨️ Chat: No further options available.");
                break;

            case 4:
                System.out.println("""
                📜 Call register:
                1. 📵 Missed calls
                2. ☎️ Received calls
                3. 📲 Dialled numbers
                4. ❌ Erase recent call lists
                5. ⏱️ Show call duration
                6. 💰 Show call costs
                7. ⚙️ Call cost settings
                8. 💳 Prepaid credit
                """);
                break;

            case 5:
                System.out.println("""
                🎵 Tones:
                1. 🎼 Ringing tone
                2. 🔊 Ringing volume
                3. 📳 Incoming call alert
                4. 🎹 Composer
                5. 📧 Message alert tone
                6. 🎛️ Keypad tones
                7. ⚠️ Warning and game tones
                8. 🌐 Vibrating alert
                9. 🖼️ Screen saver
                """);
                break;

            case 6:
                System.out.println("""
                ⚙️ Settings:
                1. 📞 Call settings
                2. 📱 Phone settings
                3. 🔒 Security settings
                4. 🔄 Restore factory settings
                """);
                break;

            case 7:
                System.out.println("📡 Call divert: Manage call forwarding options.");
                break;

            case 8:
                System.out.println("🎮 Games: Explore your games.");
                break;

            case 9:
                System.out.println("🧮 Calculator: Perform basic calculations.");
                break;

            case 10:
                System.out.println("⏰ Reminders: Set up reminders for tasks.");
                break;

            case 11:
                System.out.println("""
                🕒 Clock:
                1. ⏰ Alarm clock
                2. ⏱️ Stopwatch
                3. 🗓️ Date settings
                4. 📆 Countdown timer
                5. 🔄 Auto-update date/time
                """);
                break;

            case 12:
                System.out.println("🎭 Profiles: Manage phone profiles.");
                break;

            case 13:
                System.out.println("📀 SIM services: Access SIM-specific features.");
                break;

            default:
                System.out.println("❌ Invalid option! Please try again.");
                break;
        }
    }
}

