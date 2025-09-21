package Project;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.*; // Important for List, Map, Arrays

public class Shopping extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JTextField nameField, emailField;
    private String userName, userEmail;
    private Map<String, Map<String, java.util.List<Product>>> categories;
    private java.util.List<Product> cart; // <-- cart declared here
    private JLabel cartLabel;

    public Shopping() {
        setTitle("Shoppy App");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        cart = new ArrayList<>(); // <-- initialize cart

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        initializeData();

        mainPanel.add(loginScreen(), "Login");
        mainPanel.add(categoryScreen(), "Category");
        add(mainPanel);
        cardLayout.show(mainPanel, "Login");
    }
// LOGIN PAGE---------------------------------------------------------------------------
    private JPanel loginScreen() {
        JPanel panel = new JPanel(new GridBagLayout()); // Center everything
        panel.setBackground(new Color(200, 0, 100)); // strong red with purple tint
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // spacing
        gbc.fill = GridBagConstraints.HORIZONTAL;
  // Title
        JLabel title = new JLabel("Account Details", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 40));
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(title, gbc);
 // Name label and field
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nameLabel, gbc);
        nameField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(nameField, gbc);
 // Email label and field
        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(emailLabel, gbc);
        emailField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(emailField, gbc);
        // Login button
        JButton loginBtn = new JButton("Log In");
        gbc.gridx = 0;
        gbc.gridy = 5;
        loginBtn.addActionListener(e -> {
            userName = nameField.getText();
            userEmail = emailField.getText();
            if (userName.isEmpty() || userEmail.isEmpty())
                JOptionPane.showMessageDialog(panel, "Enter Name and Email!");
            else
                cardLayout.show(mainPanel, "Category");
        });
        panel.add(loginBtn, gbc);
        return panel;
    }
  // CATEGORY SCREEN --------------------------------------------------------------
    private JPanel categoryScreen() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Welcome to Shoppy", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 34));
        panel.add(label, BorderLayout.NORTH);
        // Map of categories and image URLs
        Map<String, String> categories = new LinkedHashMap<>();
        categories.put("Electronics", "https://i.postimg.cc/J4fsz8Np/electroincs.png");
        categories.put("Clothing", "https://i.postimg.cc/VNcgj75R/OIP.jpg");
        categories.put("Grocery", "https://i.postimg.cc/PqL34LMX/R.pngar");
        categories.put("Toys", "https://i.postimg.cc/bwLrTrwB/png-toys-toy-transparent-background-1000.png");
     // Panel for category cards (horizontal layout)
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        for (String cat : categories.keySet()) {
            try {
                URL url = new URL(categories.get(cat));
                ImageIcon icon = new ImageIcon(url);
                Image img = icon.getImage().getScaledInstance(250, 220, Image.SCALE_SMOOTH);
                JLabel imgLabel = new JLabel(new ImageIcon(img));
                imgLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
                imgLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5)); // Thicker border
                JLabel nameLabel = new JLabel(cat);
                nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
                nameLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);

                JPanel catPanel = new JPanel();
                catPanel.setLayout(new BoxLayout(catPanel, BoxLayout.Y_AXIS));
                catPanel.add(imgLabel);
                catPanel.add(Box.createRigidArea(new Dimension(0, 5)));
                catPanel.add(nameLabel);

                catPanel.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        showSubCategory(cat);
                    }
                });

                centerPanel.add(catPanel);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Wrap in a GridBagLayout panel to center vertically and horizontally
        JPanel wrapperPanel = new JPanel(new GridBagLayout());
        wrapperPanel.add(centerPanel, new GridBagConstraints());

        panel.add(wrapperPanel, BorderLayout.CENTER);
        return panel;
    }
// SUB CATEGORY-------------------------------------------------------------
    private void showSubCategory(String category) {
        JPanel panel = new JPanel(new BorderLayout());
  // Back button
        JButton back = new JButton("← Back");
        back.setFont(new Font("Arial", Font.PLAIN, 16));
        back.addActionListener(e -> cardLayout.show(mainPanel, "Category"));
     // Top panel with Back button and Title
        JPanel top = new JPanel(new BorderLayout());
  // Back button on the left
        JPanel backPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        backPanel.add(back);
        top.add(backPanel, BorderLayout.WEST);
 // Title in the center
        JLabel titleLabel = new JLabel(category);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        top.add(titleLabel, BorderLayout.CENTER);
        panel.add(top, BorderLayout.NORTH);
 // Define subcategories and images for each category
        Map<String, String[]> subMap = new LinkedHashMap<>();
        Map<String, String[]> imageMap = new LinkedHashMap<>();
        subMap.put("Electronics", new String[]{"Mobile", "Laptop", "Earphones", "TV", "Cameras"});
        imageMap.put("Electronics", new String[]{
            "https://i.postimg.cc/26jJXN69/iphone.jpg   ",
            "https://i.postimg.cc/ZqHTmMds/laptop.jpg  ",
            "https://i.postimg.cc/dDcMr2CT/th.jpg      ",
            "https://i.postimg.cc/RC7Wh4Hq/download.jpg  ",
            "https://i.postimg.cc/dQz27F6w/download.png  "
        });

        subMap.put("Clothing", new String[]{"Men", "Women", "Kids", "Footwear", "Accessories"});
        imageMap.put("Clothing", new String[]{
                    "https://i.postimg.cc/bJtz2wkr/images.jpg",
                    "https://i.postimg.cc/0ynGL86z/hq720.jpg",
                    "https://i.postimg.cc/X78yvsnh/fashion-indian-clothing-children.jpg",
                    "https://i.postimg.cc/VNy1Pc3c/360-F-892040923-H2-J3-H2-W5-Tgl-Ete-Pv-Cf2ri-BHc-DUre2w-Wp.jpg",
                    "https://i.postimg.cc/WzpSDhJc/download.jpg"
        });

        subMap.put("Grocery", new String[]{"Vegetables", "Fruits", "Snacks", "Dairy", "Bakery"});
        imageMap.put("Grocery", new String[]{
            "https://i.postimg.cc/rsYbMSZP/download.jpg",
            "https://i.postimg.cc/J0gT9RGw/download.jpg",
            "https://i.postimg.cc/B6dpp4bX/images.jpg",
            "https://i.postimg.cc/pXVhS3jT/images.jpg",
            "https://i.postimg.cc/N0dmFpYb/bakery-products-bread-and-sweet-desserts-vector.jpg"
        });

        subMap.put("Toys", new String[]{"Action Figures", "Dolls", "Puzzles", "Remote Cars", "Board Games"});
        imageMap.put("Toys", new String[]{
            "https://i.postimg.cc/rwM49z5B/beautiful-colourful-wallpaper-background-image-of-cartoon-and-film-action-figures-toys-and-dolls-at.jpg",
            "https://i.postimg.cc/yYz3VWpD/images.jpg",
            "https://i.postimg.cc/jqyCktqt/download.jpg",
            "https://i.postimg.cc/qRyBYxTj/download.png",
            "https://i.postimg.cc/B6qw9qWk/download.jpg"
        });
        String[] subcategories = subMap.get(category);
        String[] images = imageMap.get(category);
        // Panel with absolute layout to place components in custom positions
        JPanel grid = new JPanel(null);
        grid.setPreferredSize(new Dimension(1000, 500)); // Adjust as needed
        grid.setBorder(new EmptyBorder(20, 20, 20, 20));
        int[] xPositionsRow1 = {30, 360, 690};   // Spaced 330px apart
        int[] xPositionsRow2 = {195, 525};       // Spaced to fit 300px images
        int y1 = 20;
        int y2 = 200;
        for (int i = 0; i < subcategories.length; i++) {
            String name = subcategories[i];
            String imageUrl = images[i];
            JPanel subPanel = new JPanel();
            subPanel.setLayout(new BorderLayout());
            int x = i < 3 ? xPositionsRow1[i] : xPositionsRow2[i - 3];
            int y = i < 3 ? y1 : y2 + 60; // Added 60px space between first and second row
            subPanel.setBounds(x, y, 300, 240); // Wider & taller to fit image + label
            subPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
            JButton imageButton = new JButton();
            imageButton.setContentAreaFilled(false);
            imageButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 5));
            imageButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            imageButton.setPreferredSize(new Dimension(300, 200));

            try {
                ImageIcon icon = new ImageIcon(new URL(imageUrl));
                Image scaled = icon.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
                imageButton.setIcon(new ImageIcon(scaled)); 
            } catch (Exception e) {
                System.out.println("Failed to load image for: " + name + " (" + imageUrl + ")");
                e.printStackTrace();
            }
            imageButton.addActionListener(e -> showProducts(category, name));
            JLabel label = new JLabel(name, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.PLAIN, 20));
            subPanel.add(imageButton, BorderLayout.CENTER);
            subPanel.add(label, BorderLayout.SOUTH);
            grid.add(subPanel);
        }
// Wrap grid inside a centering panel
        JPanel centerWrapper = new JPanel(new GridBagLayout());
        centerWrapper.add(grid, new GridBagConstraints());
  // Now put centerWrapper into the scroll pane
        JScrollPane scrollPane = new JScrollPane(centerWrapper);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
panel.add(scrollPane, BorderLayout.CENTER);
 mainPanel.add(panel, "SubCategory");
        cardLayout.show(mainPanel, "SubCategory");
    }
 //PRODUCTS SCREEN -------------------------------------------------------------
    private void showProducts(String category, String subCategory) {
        JPanel panel = new JPanel(new BorderLayout());
 // Top Back Button
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton back = new JButton("← Back");
        back.setFont(new Font("Arial", Font.PLAIN, 16));
        back.addActionListener(e -> showSubCategory(category));
        top.add(back);
        panel.add(top, BorderLayout.NORTH);
 // Product Grid
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(0, 3, 15, 15));
        grid.setBorder(new EmptyBorder(10, 10, 10, 10));
 java.util.List<Product> products = categories.get(category).get(subCategory);
 // Cart Button (bottom panel)
        JButton cartButton = new JButton("View Cart: " + cart.size());
        cartButton.setFont(new Font("Arial", Font.BOLD, 16));
        cartButton.setBackground(Color.blue);
        cartButton.setForeground(Color.WHITE);
        cartButton.addActionListener(e -> showCart());
        for (Product p : products) {
            JPanel card = new JPanel();
            card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
            card.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
            card.setBackground(Color.WHITE);
            card.setPreferredSize(new Dimension(180, 300));  // Reduced card size
            card.setMaximumSize(new Dimension(180, 300));
            card.setMinimumSize(new Dimension(180, 300));
            card.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    card.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    card.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
                }
            });
            // Product Image
            try {
                ImageIcon img = new ImageIcon(new URL(p.imageUrl));
                Image scaled = img.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
                JLabel imgLabel = new JLabel(new ImageIcon(scaled));
                imgLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                card.add(imgLabel);
            } catch (Exception e) {
                JLabel imgLabel = new JLabel("[Image]");
                imgLabel.setPreferredSize(new Dimension(250, 120));
                card.add(imgLabel);
            }
            // Name
            JLabel name = new JLabel(p.name);
            name.setFont(new Font("Arial", Font.BOLD, 14));
            name.setAlignmentX(Component.CENTER_ALIGNMENT);
            card.add(name);
            // Price
            JLabel price = new JLabel("" + p.price);
            price.setFont(new Font("Arial", Font.BOLD, 12));
            price.setForeground(Color.RED);
            price.setAlignmentX(Component.CENTER_ALIGNMENT);
            card.add(price);
            // Rating
            JLabel rating = new JLabel("Rating: " + p.rating );
            rating.setFont(new Font("Arial", Font.PLAIN, 15));
            rating.setAlignmentX(Component.CENTER_ALIGNMENT);
            card.add(rating);
            // Description details
            JTextArea details = new JTextArea(p.details);
            details.setEditable(false);
            details.setLineWrap(true);
            details.setWrapStyleWord(true);
            details.setBackground(Color.WHITE);
            details.setFont(new Font("Arial", Font.BOLD, 12));
            details.setPreferredSize(new Dimension(160, 50));
            card.add(details);
         // Buttons Panel (Quantity Control + Add to Cart)
            JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
            JButton minusBtn = new JButton("-");
            JLabel quantityLabel = new JLabel("0");
            JButton plusBtn = new JButton("+");
            JButton addToCartBtn = new JButton("Add to Cart");
            // Style the Add to Cart button
            addToCartBtn.setBackground(new Color(34, 139, 34)); // Forest Green
            addToCartBtn.setForeground(Color.WHITE);            // White text
            addToCartBtn.setFocusPainted(false);
            addToCartBtn.setFont(new Font("Arial", Font.BOLD, 12));

            minusBtn.setEnabled(false); // initially disabled

            minusBtn.addActionListener(e -> {
                int qty = Integer.parseInt(quantityLabel.getText());
                if (qty > 0) {
                    qty--;
                    cart.remove(p);  // remove one instance
                    quantityLabel.setText(String.valueOf(qty));
                    cartButton.setText("View Cart: " + cart.size());
                }
                if (qty == 0) minusBtn.setEnabled(false);
            });
            plusBtn.addActionListener(e -> {
                int qty = Integer.parseInt(quantityLabel.getText());
                qty++;
                cart.add(p);  // add one instance
                quantityLabel.setText(String.valueOf(qty));
                cartButton.setText("View Cart: " + cart.size());
                minusBtn.setEnabled(true);
            });
 // Add to Cart button logic (same as plus button)
            addToCartBtn.addActionListener(e -> {
                int qty = Integer.parseInt(quantityLabel.getText());
                qty++;
                cart.add(p);
                quantityLabel.setText(String.valueOf(qty));
                cartButton.setText("View Cart: " + cart.size());
                minusBtn.setEnabled(true);
            });
            btnPanel.add(minusBtn);
            btnPanel.add(quantityLabel);
            btnPanel.add(plusBtn);
            btnPanel.add(addToCartBtn);  // now styled with color

            card.add(btnPanel);
            grid.add(card);
        }
        // Scrollable product area
        JScrollPane scroll = new JScrollPane(grid);
        panel.add(scroll, BorderLayout.CENTER);
        // Bottom Panel (fixed)
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
        JButton checkout = new JButton("Checkout");
        checkout.setFont(new Font("Arial", Font.BOLD, 16));
        checkout.setBackground(Color.ORANGE);
        checkout.setForeground(Color.BLACK);
        checkout.addActionListener(e -> showInvoice());
        bottomPanel.add(cartButton);
        bottomPanel.add(checkout);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        mainPanel.add(panel, "Products-" + category + "-" + subCategory);
        cardLayout.show(mainPanel, "Products-" + category + "-" + subCategory);
    }
    // -------- SHOW CART METHOD --------
    private void showCart() {
        if (cart.isEmpty()) {
            JOptionPane.showMessageDialog(mainPanel, "Cart is empty!");
            return;
        }
        JPanel panel = new JPanel(new BorderLayout());
        JLabel heading = new JLabel("Your Cart", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        heading.setBorder(new EmptyBorder(20, 0, 10, 0));
        panel.add(heading, BorderLayout.NORTH);
        // Track quantities
        Map<Product, Integer> productCount = new LinkedHashMap<>();
        for (Product p : cart) {
            productCount.put(p, productCount.getOrDefault(p, 0) + 1);
        }
        // Table-style layout
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.Y_AXIS));
        tablePanel.setBackground(Color.WHITE);
        tablePanel.setBorder(new EmptyBorder(10, 30, 10, 30));
        JScrollPane scrollPane = new JScrollPane(tablePanel);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        panel.add(scrollPane, BorderLayout.CENTER);
        JLabel totalLabel = new JLabel();
        totalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
        Runnable updateTotal = () -> {
            double grandTotal = 0;
            for (Map.Entry<Product, Integer> entry : productCount.entrySet()) {
                double price = Double.parseDouble(entry.getKey().price.replace(",", ""));
                grandTotal += entry.getValue() * price;
            }
            totalLabel.setText("Total: ₹" + grandTotal);
        };
        // Header row (optional)
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        header.setPreferredSize(new Dimension(800, 30));
        header.setMaximumSize(new Dimension(800, 30));
        header.setBackground(new Color(220, 220, 220));
        header.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        header.add(makeHeaderLabel("Product", 200));
        header.add(makeHeaderLabel("Price", 80));
        header.add(makeHeaderLabel("", 45)); // minus
        header.add(makeHeaderLabel("Qty", 40));
        header.add(makeHeaderLabel("", 45)); // plus
        header.add(makeHeaderLabel("Remove", 100));
        tablePanel.add(header);
        // Each product row
        for (Product p : productCount.keySet()) {
            int quantity = productCount.get(p);
            JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
            row.setPreferredSize(new Dimension(800, 50));
            row.setMaximumSize(new Dimension(800, 50));
            row.setMinimumSize(new Dimension(800, 50));
            row.setBackground(new Color(245, 245, 245));
            row.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY));
            JLabel nameLabel = new JLabel(p.name);
            nameLabel.setPreferredSize(new Dimension(200, 30));
            nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            JLabel priceLabel = new JLabel("₹" + p.price);
            priceLabel.setPreferredSize(new Dimension(80, 30));
            priceLabel.setFont(new Font("Arial", Font.PLAIN, 14));

            JButton minusBtn = new JButton("-");
            minusBtn.setPreferredSize(new Dimension(45, 30));

            JLabel quantityLabel = new JLabel(String.valueOf(quantity), SwingConstants.CENTER);
            quantityLabel.setPreferredSize(new Dimension(40, 30));
            quantityLabel.setFont(new Font("Arial", Font.BOLD, 14));

            JButton plusBtn = new JButton("+");
            plusBtn.setPreferredSize(new Dimension(45, 30));

            JButton removeBtn = new JButton("Remove");
            removeBtn.setPreferredSize(new Dimension(100, 30));
            removeBtn.setBackground(Color.RED);
            removeBtn.setForeground(Color.WHITE);

            minusBtn.addActionListener(e -> {
                int q = Integer.parseInt(quantityLabel.getText());
                if (q > 1) {
                    q--;
                    quantityLabel.setText(String.valueOf(q));
                    productCount.put(p, q);
                    cart.remove(p);
                } else {
                    productCount.remove(p);
                    cart.removeIf(prod -> prod.equals(p));
                    tablePanel.remove(row);
                }
                tablePanel.revalidate();
                tablePanel.repaint();
                updateTotal.run();
            });
            plusBtn.addActionListener(e -> {
                int q = Integer.parseInt(quantityLabel.getText()) + 1;
                quantityLabel.setText(String.valueOf(q));
                productCount.put(p, q);
                cart.add(p);
                updateTotal.run();
            });
            removeBtn.addActionListener(e -> {
                productCount.remove(p);
                cart.removeIf(prod -> prod.equals(p));
                tablePanel.remove(row);
                tablePanel.revalidate();
                tablePanel.repaint();
                updateTotal.run();
            });
            row.add(nameLabel);
            row.add(priceLabel);
            row.add(minusBtn);
            row.add(quantityLabel);
            row.add(plusBtn);
            row.add(removeBtn);

            tablePanel.add(row);
        }
        updateTotal.run();
        // Bottom
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.add(totalLabel);
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
        JButton continueBtn = new JButton("Continue Shopping");
        JButton checkoutBtn = new JButton("Checkout");

        continueBtn.setFont(new Font("Arial", Font.BOLD, 16));
        continueBtn.setBackground(Color.BLUE);
        continueBtn.setForeground(Color.WHITE);
        continueBtn.addActionListener(e -> {
            cardLayout.show(mainPanel, "Category");
        });
        checkoutBtn.setFont(new Font("Arial", Font.BOLD, 16));
        checkoutBtn.setBackground(Color.GREEN);
        checkoutBtn.setForeground(Color.WHITE);
        checkoutBtn.addActionListener(e -> showInvoice());
        btnPanel.add(continueBtn);
        btnPanel.add(checkoutBtn);
        bottomPanel.add(btnPanel);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        mainPanel.add(panel, "CartList");
        cardLayout.show(mainPanel, "CartList");
    }
    private JLabel makeHeaderLabel(String text, int width) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 13));
        label.setPreferredSize(new Dimension(width, 30));
        return label;
    }
 // -------- INVOICE --------
    private void showInvoice() {
        JPanel panel = new JPanel(new BorderLayout());

        // ---------- TOP HEADING ----------
        JLabel heading = new JLabel("Price Details", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        heading.setBorder(new EmptyBorder(20, 0, 10, 0));

        // ---------- CUSTOMER DETAILS ----------
        JLabel customerDetails = new JLabel("Customer: " + userName + " | Email: " + userEmail, SwingConstants.CENTER);
        customerDetails.setFont(new Font("Arial", Font.PLAIN, 18));
        customerDetails.setBorder(new EmptyBorder(0, 0, 20, 0)); // Padding below name/email

        // Wrap heading + customer details in vertical layout
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.add(heading);
        topPanel.add(customerDetails);
        panel.add(topPanel, BorderLayout.NORTH);
        // ---------- TABLE DATA ----------
        String[] columns = {"Product Name", "Quantity", "Price", "Total"};
        Map<Product, Integer> productCount = new LinkedHashMap<>();

        for (Product p : cart) {
            productCount.put(p, productCount.getOrDefault(p, 0) + 1);
        }

        String[][] data = new String[productCount.size()][4];
        int i = 0;
        double grandTotal = 0;
        for (Map.Entry<Product, Integer> entry : productCount.entrySet()) {
            Product p = entry.getKey();
            int quantity = entry.getValue();
            double price = Double.parseDouble(p.price.replace(",", ""));
            double total = quantity * price;
            grandTotal += total;
            data[i][0] = p.name;
            data[i][1] = String.valueOf(quantity);
            data[i][2] = p.price;
            data[i][3] = " " + total;
            i++;
        }

        JTable table = new JTable(data, columns);
        table.setEnabled(false);
        table.setFont(new Font("Arial", Font.PLAIN, 16));
        table.setRowHeight(30);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBorder(new EmptyBorder(10, 20, 10, 20));
        panel.add(scroll, BorderLayout.CENTER);
        // ---------- GRAND TOTAL ----------
        JLabel totalLabel = new JLabel("Total: " + grandTotal);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        totalLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
        totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        // ---------- BUTTONS ----------
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 20));
        JButton continueShopping = new JButton("Continue Shopping");
        JButton finishShopping = new JButton("Place Order");

        continueShopping.setFont(new Font("Arial", Font.BOLD, 16));
        finishShopping.setFont(new Font("Arial", Font.BOLD, 16));

        continueShopping.setBackground(Color.BLUE);
        continueShopping.setForeground(Color.WHITE);

        finishShopping.setBackground(Color.GREEN);
        finishShopping.setForeground(Color.WHITE);

        continueShopping.addActionListener(e -> {
            cardLayout.show(mainPanel, "Category");
        });

        finishShopping.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainPanel, "Thank you for shopping " + userName);
            cart.clear();
            cardLayout.show(mainPanel, "Category");
        });

        btnPanel.add(continueShopping);
        btnPanel.add(finishShopping);

        // Wrap bottom in one panel with BoxLayout (to stack total + buttons)
        JPanel bottomWrapper = new JPanel();
        bottomWrapper.setLayout(new BoxLayout(bottomWrapper, BoxLayout.Y_AXIS));
        bottomWrapper.add(Box.createVerticalStrut(10));
        bottomWrapper.add(totalLabel);
        bottomWrapper.add(btnPanel);

        panel.add(bottomWrapper, BorderLayout.SOUTH);

        mainPanel.add(panel, "Invoice");
        cardLayout.show(mainPanel, "Invoice");
    }
 //  INITIALIZE DATA -----------------------------------------------------------------------
    private void initializeData() {
        categories = new LinkedHashMap<>();
        // -------- Electronics --------
        Map<String, java.util.List<Product>> electronics = new LinkedHashMap<>();
        electronics.put("Mobile", Arrays.asList(
        		new Product("iPhone 14", "70000", "https://i.postimg.cc/26jJXN69/iphone.jpg", 4.5, "\n\t8GB RAM, 128GB ROM, Black"),
            new Product("Samsung Galaxy", "55000", "https://i.postimg.cc/15SWWZjG/images.jpg", 4.3, "\n\t8GB RAM, 256GB ROM, Blue"),
            new Product("Realme GT", "30000", "https://i.postimg.cc/mg5yGx86/download.jpg", 4.1, "\n\t6GB RAM, 128GB ROM, White"),
            new Product("Vivo V25", "25000", "https://i.postimg.cc/DwHpPbkZ/download.jpg", 4.0, "\n\t6GB RAM, 128GB ROM, Green"),
            new Product("Poco X6 Pro", "20000", "https://i.postimg.cc/sXHRygGZ/images.jpg", 3.9, "8GB RAM, 256GB ROM, Yellow")
        ));
        electronics.put("Laptop", Arrays.asList(
            new Product("MacBook Pro", "150000", "https://i.postimg.cc/PJcrRVZ3/hero-image-fill-size-1248x702-v1713987828.png", 4.8, "\n\t16GB RAM, 512GB SSD"),
            new Product("Dell XPS", "120000", "https://i.postimg.cc/J09MqDVS/download.jpg", 4.5, "\n\t16GB RAM, 512GB SSD"),
            new Product("HP Pavilion", "90000", "https://i.postimg.cc/PfLLm113/download.jpg", 4.2, "\n\t8GB RAM, 256GB SSD"),
            new Product("Lenovo ThinkPad", "100000", "https://i.postimg.cc/Gp72Dptn/images.jpg", 4.3, "\n\t16GB RAM, 512GB SSD"),
            new Product("Asus ZenBook", "95000", "https://i.postimg.cc/NF0k4F78/download.jpg", 4.1, "\n\t8GB RAM, 256GB SSD")
        ));
        electronics.put("Earphones", Arrays.asList(
            new Product("AirPods Pro", "25000", "https://i.postimg.cc/NjQm75sK/images.jpg", 4.7, "\n\tWireless, Noise Cancelling"),
            new Product("Sony WH-1000XM4", "20000", "https://i.postimg.cc/dV7vf9tp/images.jpg", 4.6, "\n\tWireless, Noise Cancelling"),
            new Product("Bose QC Earbuds", "22000", "https://i.postimg.cc/W42835Ff/images.jpg", 4.5, "\n\tWireless, Noise Cancelling"),
            new Product("OnePlus Buds", "5000", "https://i.postimg.cc/25K0K4yc/images.jpg", 4.2, "\n\tWireless"),
            new Product("Realme Buds", "3000", "https://i.postimg.cc/tJyWST3v/images.jpg", 4.0, "\n\tWired")
        ));
        electronics.put("TV", Arrays.asList(
            new Product("Samsung QLED", "120000", "https://i.postimg.cc/HxWvHQpm/960x0.png", 4.6, "\n\t55 Inch, 4K"),
            new Product("LG OLED", "150000", "https://i.postimg.cc/9fCJtGw9/images.jpg", 4.7, "\n\t55 Inch, 4K"),
            new Product("Sony Bravia", "130000", "https://i.postimg.cc/4yD1KtTm/download.jpg", 4.5, "\n\t50 Inch, 4K"),
            new Product("TCL LED", "80000", "https://i.postimg.cc/Y2TcNsrm/images.jpg", 4.2, "\n\t50 Inch, Full HD"),
            new Product("Mi TV", "60000", "https://i.postimg.cc/85s3MhxH/4f7d13c1d592c7cee8376d7b3eccd20b.jpg", 4.1, "\n\t43 Inch, Full HD")
        ));
        electronics.put("Cameras", Arrays.asList(
            new Product("Canon EOS", "80000", "https://i.postimg.cc/vHjmVzjP/download.jpg", 4.5, "\n\tDSLR, 24MP"),
            new Product("Nikon D3500", "75000", "https://i.postimg.cc/fb7W1hbF/download.jpg", 4.4, "\n\tDSLR, 24MP"),
            new Product("Sony Alpha", "90000", "https://i.postimg.cc/QCzjc86B/download.jpg", 4.6, "\n\tMirrorless, 24MP"),
            new Product("Fujifilm X-T30", "85000", "https://i.postimg.cc/htTK7qVj/download.jpg", 4.5, "\n\tMirrorless, 26MP"),
            new Product("GoPro Hero 9", "40000", "https://i.postimg.cc/tTSbHRGr/download.jpg", 4.3, "\n\tAction Camera")
        ));
        categories.put("Electronics", electronics);
     // -------- Clothing --------
        Map<String, java.util.List<Product>> clothing = new LinkedHashMap<>();
        clothing.put("Men", Arrays.asList(
            new Product("Shirt", "1200", "https://i.postimg.cc/gcDtqxHD/images.jpg", 4.2, "\n\tCotton, Blue. Comfortable cotton shirt \nin blue. Perfect for casual and office wear"),
            new Product("T-Shirt", "800", "https://i.postimg.cc/FsCP8wqk/images.jpg", 4.1, "\n\tCotton, White"),
            new Product("Jeans", "1500", "https://i.postimg.cc/DwtxyL72/images.jpg", 4.3, "\n\tDenim, Black"),
            new Product("Jacket", "2000", "https://i.postimg.cc/mDTNtSJG/A1mh-Un5-Uej-L-UY1100.jpg", 4.5, "\n\tLeather, Brown"),
            new Product("Shorts", "900", "https://i.postimg.cc/nrgDYKRr/images.jpg", 4.0, "\n\tCotton, Grey")
        ));
        clothing.put("Women", Arrays.asList(
            new Product("Dress", "1800", "https://i.postimg.cc/wB2RbYfS/images.jpg", 4.5, "\n\tCotton, Red"),
            new Product("Skirt", "1200", "https://i.postimg.cc/T1LywLd6/images.jpg", 4.2, "\n\tCotton, Blue"),
            new Product("Top", "900", "https://i.postimg.cc/Mpbnv8Sv/images.jpg", 4.1, "\n\tCotton, White"),
            new Product("Jeans", "1500", "https://i.postimg.cc/G2N2ZLkS/images.jpg", 4.3, "\n\tDenim, Black"),
            new Product("Jacket", "2200", "https://i.postimg.cc/h4f2FKF8/download.jpg", 4.4, "\n\tLeather, Brown")
        ));
        clothing.put("Kids", Arrays.asList(
            new Product("T-Shirt", "500", "https://i.postimg.cc/9Q0bBh0f/images.jpg", 4.1, "\n\tCotton, Yellow"),
            new Product("Shorts", "400", "https://i.postimg.cc/sgCfYVwY/images.jpg", 4.0, "\n\tCotton, Green"),
            new Product("Dress", "600", "https://i.postimg.cc/vm9NWs2V/images.jpg", 4.2, "\n\tCotton, Pink"),
            new Product("Sweater", "800", "https://i.postimg.cc/3J5CvG5n/images.jpg", 4.3, "\n\tWool, Blue"),
            new Product("Jacket", "1000", "https://i.postimg.cc/k5M5GKNV/download.jpg", 4.4, "\n\tLeather, Red")
        ));
        clothing.put("Footwear", Arrays.asList(
            new Product("Nike Shoes", "5000", "https://i.postimg.cc/fLqF2Nt8/images.jpg", 4.5, "\n\tSports Shoes"),
            new Product("Adidas Shoes", "4800", "https://i.postimg.cc/rwcktqS4/images.jpg", 4.4, "\n\tSports Shoes"),
            new Product("Puma Shoes", "4500", "https://i.postimg.cc/vHwRpG2K/download.jpg", 4.2, "\n\tCasual Shoes"),
            new Product("Reebok Shoes", "4000", "https://i.postimg.cc/wvRPGrXH/images.jpg", 4.1, "\n\tSports Shoes"),
            new Product("Skechers", "4200", "https://i.postimg.cc/dt6W4Fbr/images.jpg", 4.3, "\n\tCasual Shoes")
        ));
        clothing.put("Accessories", Arrays.asList(
            new Product("Belt", "800", "https://i.postimg.cc/7ZcnWZmG/download.jpg", 4.1, "\n\tLeather"),
            new Product("Watch", "5000", "https://i.postimg.cc/Y23fw3dw/images.jpg", 4.5, "\n\tAnalog"),
            new Product("Sunglasses", "1200", "https://i.postimg.cc/SQD8PKKS/images.jpg", 4.3, "\n\tUV Protection"),
            new Product("Hat", "600", "https://i.postimg.cc/zX4LmHYr/images.jpg", 4.0, "\n\tCotton"),
            new Product("Wallet", "900", "https://i.postimg.cc/TPtf6B5D/images.jpg", 4.2, "\n\tLeather")
        ));
        categories.put("Clothing", clothing);
     // -------- Grocery --------
        Map<String, java.util.List<Product>> grocery = new LinkedHashMap<>();
        grocery.put("Vegetables", Arrays.asList(
            new Product("Tomato", "40", "https://i.postimg.cc/ZYQcWkTX/download.jpg", 4.2, "1kg. Fresh and juicy red tomatoes. Perfect for salads, curries, and sauces."),
            new Product("Potato", "30", "https://i.postimg.cc/qRbGcS2h/download.jpg", 4.0, "1kg. Versatile kitchen essential. Great for fries, curries, and baked dishes."),
            new Product("Onion", "50", "https://i.postimg.cc/MpVdksJN/download.jpg", 4.1, "1kg .Rich flavor and aroma. A must-have for everyday cooking."),
            new Product("Carrot", "60", "https://i.postimg.cc/CMrvbB4P/download.jpg", 4.3, "1kg .Crunchy and sweet carrots. Ideal for salads, soups, and snacks."),
            new Product("Cabbage", "35", "https://i.postimg.cc/3wjSGtLm/download.jpg", 4.2, "1kg .Green and fresh cabbage. Perfect for stir-fries and healthy meals.")
        ));
        grocery.put("Fruits", Arrays.asList(
            new Product("Apple", "120", "https://i.postimg.cc/sXcNkT7s/download.jpg", 4.5, "\n1kg.Crisp and sweet apples. \nA healthy fruit packed with nutrition."),
            new Product("Banana", "50", "https://i.postimg.cc/ZKD1Ysgq/download.jpg", 4.2, "\n1 Dozen. Naturally sweet bananas.\n Great for snacks, shakes, and desserts."),
            new Product("Orange", "80", "https://i.postimg.cc/0yhRnXd4/download.jpg", 4.3, "\n1kg. Juicy oranges full of Vitamin C. \nRefreshing and healthy for daily intake."),
            new Product("Mango", "150", "https://i.postimg.cc/MT2w63nB/download.jpg", 4.6, "\n1kg .Delicious seasonal mangoes. \nThe king of fruits loved by all ages."),
            new Product("Grapes", "100", "https://i.postimg.cc/7Ymq3NRv/download.jpg", 4.4, "\n1kg .Fresh, sweet, and tangy grapes. \nPerfect for snacking or making juice.")
        ));
        grocery.put("Snacks", Arrays.asList(
            new Product("Lays", "20", "https://i.postimg.cc/NGRMHmYY/download.jpg", 4.1, "Pack .Crispy potato chips in tasty flavors. A perfect snack anytime."),
            new Product("KurKure", "15", "https://i.postimg.cc/VLBd3MH4/download.jpg", 4.0, "Pack .Crunchy and spicy KurKure. A fun snack for parties and tea time."),
            new Product("Doritos", "25", "https://i.postimg.cc/SQ9XfH6B/download.jpg", 4.2, "Pack .Bold and crunchy nacho chips. Great with dips and sauces."),
            new Product("Bingo", "15", "https://i.postimg.cc/8CnFZSnS/download.jpg", 4.0, "Pack. Tasty and crispy snack. Available in exciting flavors for everyone."),
            new Product("Haldiram", "30", "https://i.postimg.cc/mZ196Ps6/download.jpg", 4.3, "Pack.Authentic Indian snacks by Haldiram. Perfect for munching anytime.")
        ));
        grocery.put("Dairy", Arrays.asList(
            new Product("Milk", "50", "https://i.postimg.cc/T2BVRr06/download.jpg", 4.5, "1 Litre .Pure and fresh milk. Essential for tea, coffee, and daily nutrition."),
            new Product("Butter", "120", "https://i.postimg.cc/3RRRGcKc/download.jpg", 4.4, "200gm. Creamy and rich butter. Ideal for cooking, baking, and spreading."),
            new Product("Cheese", "150", "https://i.postimg.cc/wB93qBnH/download.jpg", 4.3, "200gm. Delicious cheese slices and blocks. Perfect for sandwiches and pizzas."),
            new Product("Yogurt", "80", "https://i.postimg.cc/P5sP7y4C/download.jpg", 4.2, "500gm .Thick and fresh yogurt. Great for digestion and cooling in summers."),
            new Product("Paneer", "200", "https://i.postimg.cc/3rqyXY0C/download.jpg", 4.5, "250gm .Soft and fresh paneer. A protein-rich ingredient for Indian dishes.")
        ));
        grocery.put("Bakery", Arrays.asList(
            new Product("Bread", "40", "https://i.postimg.cc/QCzWVr1m/download.jpg", 4.1, "Loaf .Soft and fresh bread loaf. Perfect for sandwiches and toasts."),
            new Product("Cake", "300", "https://i.postimg.cc/B6gTSym7/download.jpg", 4.5, "500gm .Delicious and spongy cakes. Great for celebrations and desserts."),
            new Product("Cookies", "120", "https://i.postimg.cc/gJdyPdH6/download.jpg", 4.3, "Pack .Crunchy and tasty cookies. A delightful snack with tea or coffee."),
            new Product("Croissant", "80", "https://i.postimg.cc/CKbCtdkg/download.jpg", 4.2, "Each .Flaky and buttery croissants. A classic bakery treat for breakfast."),
            new Product("Muffin", "100", "https://i.postimg.cc/Wb4n3NLG/download.jpg", 4.0, "Each .Soft and sweet muffins. A perfect little snack for any time of day.")
        ));
        categories.put("Grocery", grocery);
     // -------- Toys --------
        Map<String, java.util.List<Product>> toys = new LinkedHashMap<>();
        toys.put("Action Figures", Arrays.asList(
            new Product("Superman", "800", "https://i.postimg.cc/RFGkFgwP/download.jpg", 4.5, "Plastic, 12 inch Bring home the Man of Steel with this detailed action figure."),
            new Product("Batman", "900", "https://i.postimg.cc/66jhHrMd/download.jpg", 4.4, "Plastic, 12 inch The Dark Knight in an iconic pose."),
            new Product("Spiderman", "850", "https://i.postimg.cc/2jFw4pZX/download.jpg", 4.3, "Plastic, 12 inch Swing into action with this Spiderman figure."),
            new Product("Ironman", "1000", "https://i.postimg.cc/y6ZqB823/download.jpg", 4.6, "Plastic, 12 inch Suit up with Ironman and his heroic armor."),
            new Product("Hulk", "750", "https://i.postimg.cc/nL0RK6gJ/download.jpg", 4.2, "Plastic, 12 inch Smash into fun with the mighty Hulk figure.")
        ));
        toys.put("Dolls", Arrays.asList(
            new Product("Barbie", "1200", "https://i.postimg.cc/Tw28fjMR/download.jpg", 4.5, "Plastic, 10 inch Classic Barbie with stylish outfits."),
            new Product("American Girl", "2500", "https://i.postimg.cc/7Y5k5NCh/images.jpg", 4.7, "Plastic, 12 inch A premium doll with realistic details."),
            new Product("Disney Princess", "1500", "https://i.postimg.cc/3JNKgTqK/download.jpg", 4.6, "Plastic, 10 inch Bring fairy tales to life with a Disney Princess doll."),
            new Product("Teddy bear", "1000", "https://i.postimg.cc/K8XnPHzB/download.jpg", 4.3, "\n\t8 inch with good fabric teddy"),
            new Product("Baby Alive", "1300", "https://i.postimg.cc/qRc7Zxc4/images.jpg", 4.4, "Plastic, 10 inch Interactive baby doll that feels lifelike.")
        ));
        toys.put("Puzzles", Arrays.asList(
            new Product("Rubik's Cube", "400", "https://i.postimg.cc/2STFgnwd/download.png", 4.6, "3x3 Cube Challenge your mind with the classic Rubik's Cube."),
            new Product("Jigsaw Puzzle", "500", "https://i.postimg.cc/sDdcWjxW/download.png", 4.4, "500 Pieces Piece together beautiful images with this jigsaw puzzle."),
            new Product("Sudoku Book", "200", "https://i.postimg.cc/RhfLY8sq/download.jpg", 4.2, "Book Enjoy hours of brain-teasing fun with Sudoku puzzles."),
            new Product("3D Puzzle", "800", "https://i.postimg.cc/GmRqWL1R/download.jpg", 4.3, "Wooden Build stunning 3D structures with this puzzle."),
            new Product("Maze Puzzle", "300", "https://i.postimg.cc/pXFfVgBd/download.png", 4.1, "Plastic Test your skills with this tricky maze puzzle.")
        ));
        toys.put("Remote Cars", Arrays.asList(
            new Product("Red Racer", "1500", "https://i.postimg.cc/J4DqDyRM/download.jpg", 4.3, "Battery Operated High-speed red racer for thrilling fun."),
            new Product("Blue Speed", "1800", "https://i.postimg.cc/Wp9WJLr6/download.jpg", 4.5, "Battery Operated Zoom into action with this fast blue car."),
            new Product("Green Zoom", "1200", "https://i.postimg.cc/YqssTKCq/download.jpg", 4.1, "Battery Operated Eco-style green remote car for endless fun."),
            new Product("Yellow Flash", "1600", "https://i.postimg.cc/9Qssw36N/download.jpg", 4.4, "Battery Operated Bright yellow speedster for racing fun."),
            new Product("Black Thunder", "2000", "https://i.postimg.cc/TY7zG5Cx/download.jpg", 4.6, "Battery Operated Powerful black remote car with top speed.")
        ));
        toys.put("Board Games", Arrays.asList(
            new Product("Chess", "500", "https://i.postimg.cc/QNR7zfrZ/download.jpg", 4.6, "Wooden Board Classic strategy game for sharp minds."),
            new Product("Ludo", "300", "https://i.postimg.cc/4d2dpxXT/download.png", 4.3, "Plastic Board Fun family board game for all ages."),
            new Product("Uno Cards", "500", "https://i.postimg.cc/Gt8yYFnX/download.jpg", 4.5, "\n\tCard & Board"),
            new Product("Snakes & Ladders", "400", "https://i.postimg.cc/8P27ycMp/download.jpg", 4.2, "Plastic Board A timeless game of luck and fun."),
            new Product("Carrom", "800", "https://i.postimg.cc/brdZ52mJ/download.jpg", 4.4, "Wooden Board Traditional indoor game for hours of fun.")
        ));
        categories.put("Toys", toys);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Shopping().setVisible(true));
    }
    // -------- PRODUCT CLASS --------
    class Product {
        String name, price, imageUrl, details;
        double rating;

        public Product(String name, String price, String imageUrl, double rating, String details) {
            this.name = name;
            this.price = price;
            this.imageUrl = imageUrl;
            this.rating = rating;
            this.details = details;
        }
    }
}