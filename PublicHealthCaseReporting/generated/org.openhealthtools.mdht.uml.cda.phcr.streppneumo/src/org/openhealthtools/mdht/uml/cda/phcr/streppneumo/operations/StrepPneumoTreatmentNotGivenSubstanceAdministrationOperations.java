/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.phcr.operations.TreatmentNotGivenSubstanceAdministrationOperations;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Not Given Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoTreatmentNotGivenSubstanceAdministrationOperations extends TreatmentNotGivenSubstanceAdministrationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoTreatmentNotGivenSubstanceAdministrationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTreatmentNotGivenSubstanceAdministrationTemplateId(StrepPneumoTreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationTemplateId(StrepPneumoTreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.127')";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatmentNotGivenSubstanceAdministrationTemplateId(StrepPneumoTreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationTemplateId(StrepPneumoTreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.127')
	 * @param strepPneumoTreatmentNotGivenSubstanceAdministration The receiving '<em><b>Treatment Not Given Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTreatmentNotGivenSubstanceAdministrationTemplateId(StrepPneumoTreatmentNotGivenSubstanceAdministration strepPneumoTreatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoTreatmentNotGivenSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TreatmentNotGivenSubstanceAdministrationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoTreatmentNotGivenSubstanceAdministration, context) }),
						 new Object [] { strepPneumoTreatmentNotGivenSubstanceAdministration }));
			}
			 
			return false;
		}
		return true;
	}

} // StrepPneumoTreatmentNotGivenSubstanceAdministrationOperations