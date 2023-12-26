import '@styles/globals.css';
import { Children } from 'react';
import Nav from '@components/Nav';

// 这个对象用于设置元数据。
// title 用于设置网页标题，就是标签页上的文本； description 设置网页描述
//https://www.youtube.com/watch?v=wm5gMKuwSYk&list=WL&index=12

export const metadata = {
  title: 'HappyDay Hotel',
  description: 'Happy & Share ',
};

const RootLayout = ({ children }) => {
  return (
    <html lang="en">
      <body>
        <div className="main">
          <div className="gradient" />
        </div>
        <main className="app">
          <Nav />
          {children}
        </main>
      </body>
    </html>
  );
};

export default RootLayout;
