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

// Responsive Navigation
const navbarToggle = document.querySelector('.navbar-toggle');
const navbarMenu = document.querySelector('.navbar-menu');

navbarToggle.addEventListener('click', () => {
  navbarMenu.classList.toggle('active');
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