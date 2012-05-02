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
package org.openhealthtools.mdht.uml.cda.phcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Not Given Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Treatment Not Given Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration#validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Status Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreatmentNotGivenSubstanceAdministrationOperations extends SubstanceAdministrationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreatmentNotGivenSubstanceAdministrationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Treatment Not Given Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.negationInd=true";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Treatment Not Given Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.negationInd=true
	 * @param treatmentNotGivenSubstanceAdministration The receiving '<em><b>Treatment Not Given Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(treatmentNotGivenSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TREATMENT_NOT_GIVEN_NEGATION_IND,
						 PhcrPlugin.INSTANCE.getString("TreatmentNotGivenSubstanceAdministrationTreatmentNotGivenNegationInd"),
						 new Object [] { treatmentNotGivenSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.56')
	 * @param treatmentNotGivenSubstanceAdministration The receiving '<em><b>Treatment Not Given Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTreatmentNotGivenSubstanceAdministrationTemplateId(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(treatmentNotGivenSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID,
						 PhcrPlugin.INSTANCE.getString("TreatmentNotGivenSubstanceAdministrationTemplateId"),
						 new Object [] { treatmentNotGivenSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClass::SBADM
	 * @param treatmentNotGivenSubstanceAdministration The receiving '<em><b>Treatment Not Given Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTreatmentNotGivenSubstanceAdministrationClassCode(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(treatmentNotGivenSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE,
						 PhcrPlugin.INSTANCE.getString("TreatmentNotGivenSubstanceAdministrationClassCode"),
						 new Object [] { treatmentNotGivenSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN
	 * @param treatmentNotGivenSubstanceAdministration The receiving '<em><b>Treatment Not Given Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTreatmentNotGivenSubstanceAdministrationMoodCode(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(treatmentNotGivenSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE,
						 PhcrPlugin.INSTANCE.getString("TreatmentNotGivenSubstanceAdministrationMoodCode"),
						 new Object [] { treatmentNotGivenSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTreatmentNotGivenSubstanceAdministrationTemplateId(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationTemplateId(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.56')";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatmentNotGivenSubstanceAdministrationTemplateId(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationTemplateId(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateTreatmentNotGivenSubstanceAdministrationClassCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationClassCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::SBADM";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatmentNotGivenSubstanceAdministrationClassCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationClassCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateTreatmentNotGivenSubstanceAdministrationMoodCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationMoodCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatmentNotGivenSubstanceAdministrationMoodCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationMoodCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateTreatmentNotGivenSubstanceAdministrationNegationInd(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Negation Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationNegationInd(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.negationInd.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatmentNotGivenSubstanceAdministrationNegationInd(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Negation Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationNegationInd(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.negationInd.oclIsUndefined()
	 * @param treatmentNotGivenSubstanceAdministration The receiving '<em><b>Treatment Not Given Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTreatmentNotGivenSubstanceAdministrationNegationInd(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(treatmentNotGivenSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_NEGATION_IND,
						 PhcrPlugin.INSTANCE.getString("TreatmentNotGivenSubstanceAdministrationNegationInd"),
						 new Object [] { treatmentNotGivenSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTreatmentNotGivenSubstanceAdministrationStatusCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationStatusCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatmentNotGivenSubstanceAdministrationStatusCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationStatusCode(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param treatmentNotGivenSubstanceAdministration The receiving '<em><b>Treatment Not Given Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTreatmentNotGivenSubstanceAdministrationStatusCode(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(treatmentNotGivenSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE,
						 PhcrPlugin.INSTANCE.getString("TreatmentNotGivenSubstanceAdministrationStatusCode"),
						 new Object [] { treatmentNotGivenSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Not Given Substance Administration Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(TreatmentNotGivenSubstanceAdministration, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())
	 * @param treatmentNotGivenSubstanceAdministration The receiving '<em><b>Treatment Not Given Substance Administration</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateTreatmentNotGivenSubstanceAdministrationStatusCodeP(TreatmentNotGivenSubstanceAdministration treatmentNotGivenSubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION);
			try {
				VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(treatmentNotGivenSubstanceAdministration)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION_STATUS_CODE_P,
						 PhcrPlugin.INSTANCE.getString("TreatmentNotGivenSubstanceAdministrationStatusCodeP"),
						 new Object [] { treatmentNotGivenSubstanceAdministration }));
			}
			return false;
		}
		return true;
	}

} // TreatmentNotGivenSubstanceAdministrationOperations