import '@styles/globals.css';
import Nav from '@components/Nav';
import Provider from '@components/Provider';

// 这个对象用于设置元数据。
// title 用于设置网页标题，就是标签页上的文本； description 设置网页描述

export const metadata = {
  title: 'HappyDay Hotel',
  description: 'Happy & Share ',
};

const RootLayout = ({ children }) => {
  return (
    <html lang="en">
      <body>
        <Provider>
          <div className="main">
            <div className="gradient" />
          </div>
          <main className="app">
            <Nav />
            {children}
          </main>
        </Provider>
      </body>
    </html>
  );
};

export default RootLayout;
