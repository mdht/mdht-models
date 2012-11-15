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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Require Results Organizer Template ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerVitalSignObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Vital Sign Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#validateIHEVitalSignsOrganizerAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer#getVitalSignObservations() <em>Get Vital Sign Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizerOperations extends
		org.openhealthtools.mdht.uml.cda.ccd.operations.VitalSignsOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Require Results Organizer Template ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root ='2.16.840.1.113883.10.20.1.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Require Results Organizer Template ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIHEVitalSignsOrganizerRequireResultsOrganizerTemplateID(
			VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_REQUIRE_RESULTS_ORGANIZER_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerRequireResultsOrganizerTemplateID"),
					new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.13.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerTemplateId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIHEVitalSignsOrganizerTemplateId(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerTemplateId"),
					new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerClassCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerClassCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerClassCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerClassCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIHEVitalSignsOrganizerClassCode(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_CLASS_CODE,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerClassCode"),
					new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '46680005' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEVitalSignsOrganizerCode(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_CODE,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerCode"), new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIHEVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerEffectiveTime"),
					new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerStatusCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerStatusCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerStatusCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerStatusCode(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEVitalSignsOrganizerStatusCode(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_STATUS_CODE,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerStatusCode"),
					new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerId(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIHEVitalSignsOrganizerId(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_ID,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerId"), new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Vital Sign Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(ihe::VitalSignObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Vital Sign Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIHEVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerVitalSignObservation"),
					new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIHEVitalSignsOrganizerAuthor(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerAuthor(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateIHEVitalSignsOrganizerAuthor(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Vital Signs Organizer Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIHEVitalSignsOrganizerAuthor(VitalSignsOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer The receiving '<em><b>Vital Signs Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateIHEVitalSignsOrganizerAuthor(VitalSignsOrganizer vitalSignsOrganizer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.VITAL_SIGNS_ORGANIZER);
			try {
				VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IHE_VITAL_SIGNS_ORGANIZER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.VITAL_SIGNS_ORGANIZER__IHE_VITAL_SIGNS_ORGANIZER_AUTHOR,
					IHEPlugin.INSTANCE.getString("IHEVitalSignsOrganizerAuthor"), new Object[] { vitalSignsOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignObservations(VitalSignsOrganizer) <em>Get Vital Sign Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignObservations(VitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::VitalSignObservation)).oclAsType(ihe::VitalSignObservation)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignObservations(VitalSignsOrganizer) <em>Get Vital Sign Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignObservations(VitalSignsOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<VitalSignObservation> getVitalSignObservations(VitalSignsOrganizer vitalSignsOrganizer) {
		if (GET_VITAL_SIGN_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.VITAL_SIGNS_ORGANIZER,
				IHEPackage.Literals.VITAL_SIGNS_ORGANIZER.getEAllOperations().get(73));
			try {
				GET_VITAL_SIGN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGN_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSignObservation> result = (Collection<VitalSignObservation>) query.evaluate(vitalSignsOrganizer);
		return new BasicEList.UnmodifiableEList<VitalSignObservation>(result.size(), result.toArray());
	}

} // VitalSignsOrganizerOperations
