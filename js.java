// Search Bar Functionality
const searchInput = document.querySelector('.search-input');
const nftGrid = document.querySelector('.nft-grid');

searchInput.addEventListener('input', (e) => {
  const searchTerm = e.target.value.toLowerCase();
  const nftItems = nftGrid.children;

  for (let i = 0; i < nftItems.length; i++) {
    const nftItem = nftItems[i];
    const nftName = nftItem.querySelector('h2').textContent.toLowerCase();

    if (nftName.includes(searchTerm)) {
      nftItem.style.display = 'block';
    } else {
      nftItem.style.display = 'none';
    }
  }
});

// Hamburger Menu Functionality
const hamburger = document.querySelector('.hamburger');
const navbar = document.querySelector('.navbar');

hamburger.addEventListener('click', () => {
  navbar.classList.toggle('active');
});

// Smooth Scrolling
const anchorLinks = document.querySelectorAll('a[href*="#"]');

anchorLinks.forEach((anchor) => {
  anchor.addEventListener('click', (e) => {
    e.preventDefault();

    const targetId = anchor.getAttribute('href');
    const targetElement = document.querySelector(targetId);

    window.scrollTo({
      top: targetElement.offsetTop,
      behavior: 'smooth',
    });
  });
});