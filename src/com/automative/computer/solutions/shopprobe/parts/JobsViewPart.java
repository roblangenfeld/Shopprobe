/*******************************************************************************
 * Copyright (c) 2013 Automotive Computer Solutions. All Rights Reserved. For All Countries
 *
 * Contributors:
 *     Robert Langenfeld
 *******************************************************************************/
package com.automative.computer.solutions.shopprobe.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import com.automative.computer.solutions.shopprobe.dataManagers.ActiveJobManager;
import com.automative.computer.solutions.shopprobe.model.Job;

public class JobsViewPart {
	private TableViewer tableViewer;
	private Table table;
	
	@PostConstruct
	public void createComposite(Composite parent) {
		System.out.println("Print first");
		parent.setLayout(new GridLayout());
		tableViewer = new TableViewer(parent, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();
		createColumnHeaders();
		
		ActiveJobManager manager = ActiveJobManager.getInstance();
		manager.generateActiveJobs();
		//TODO This is dummy data at the moment. This needs to pull from the database to set the data in each row.
//		int count = 128;
		for (int i = 0; i < manager.getActiveJobList().size() -1; i++) {
			Job job = manager.getActiveJobList().get(i);
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(0, Integer.toString(job.getJobNumber()));
			item.setText(1, Messages.SamplePart_8);
			item.setText(2, Messages.SamplePart_9);
			item.setText(3, Messages.SamplePart_10);
			item.setText(4, Messages.SamplePart_11);
			item.setText(5, Messages.SamplePart_12);
			item.setText(6, Messages.SamplePart_13 + i + Messages.SamplePart_14);
		}
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
	}

	private void init(Composite parent){
		
	}
	
	/**
	 * Creates the column headers for the jobs table
	 */
	private void createColumnHeaders() {
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		String[] titles = { "R/O #", "Customer", "Automobile", "Parts", "Ord", "Rec", "Ret", "Merge", "Job Status",
				"Rental Agency", "VIN Number" };

		for (int i = 0; i < titles.length; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setText(titles[i]);
			table.getColumn(i).pack();
		}
	}

}
