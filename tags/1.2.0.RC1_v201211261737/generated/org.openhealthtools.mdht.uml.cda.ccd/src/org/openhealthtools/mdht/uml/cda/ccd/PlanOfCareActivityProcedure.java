/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Procedure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Of Care Activity Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage#getPlanOfCareActivityProcedure()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PlanOfCareActivityProcedureTemplateId PlanOfCareActivityProcedureMoodCodeValue PlanOfCareActivityProcedureId PlanOfCareActivityProcedureMoodCode' templateId.root='2.16.840.1.113883.10.20.1.25' contextDependent='true'"
 * @generated
 */
public interface PlanOfCareActivityProcedure extends Procedure, PlanOfCareActivity {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode = vocab::x_DocumentProcedureMood::INT or self.moodCode = vocab::x_DocumentProcedureMood::ARQ\r\n  or self.moodCode = vocab::x_DocumentProcedureMood::PRMS or self.moodCode = vocab::x_DocumentProcedureMood::PRP\r\n  or self.moodCode = vocab::x_DocumentProcedureMood::RQO'"
	* @generated
	*/
	boolean validatePlanOfCareActivityProcedureMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.25\')'"
	* @generated
	*/
	boolean validatePlanOfCareActivityProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	* @generated
	*/
	boolean validatePlanOfCareActivityProcedureId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'moodCode\')'"
	* @generated
	*/
	boolean validatePlanOfCareActivityProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PlanOfCareActivityProcedure init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityProcedure init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PlanOfCareActivityProcedure
