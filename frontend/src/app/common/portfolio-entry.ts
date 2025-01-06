export class PortfolioEntry {

  constructor(
    public title: string,
    public description: string,
    public active: boolean,
    public createTime: Date,
    public updateTime: Date,
  ) {
  }
}
