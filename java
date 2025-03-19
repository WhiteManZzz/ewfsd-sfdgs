document.getElementById('rsvpForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const name = document.getElementById('name').value;
    const attendance = document.getElementById('attendance').value;
    
    let message = '';
    if (attendance === 'yes') {
        message = `Спасибо, ${name}! Мы рады, что вы придёте!`;
    } else {
        message = `Спасибо, ${name}! Жаль, что вы не сможете быть с нами.`;
    }
    
    document.getElementById('responseMessage').textContent = message;
});
