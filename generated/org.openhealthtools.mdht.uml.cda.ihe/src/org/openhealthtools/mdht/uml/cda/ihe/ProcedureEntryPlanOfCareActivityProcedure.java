/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe;

import java.lang.Iterable;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Entry Plan Of Care Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getProcedureEntryPlanOfCareActivityProcedure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation moodCode='INT' constraints.validation.error='PlanOfCareActivityProcedureMoodCode'"
 * @generated
 */
public interface ProcedureEntryPlanOfCareActivityProcedure extends PlanOfCareActivityProcedure, ProcedureEntry {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProcedureEntryPlanOfCareActivityProcedure init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureEntryPlanOfCareActivityProcedure init(
			Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProcedureEntryPlanOfCareActivityProcedure
