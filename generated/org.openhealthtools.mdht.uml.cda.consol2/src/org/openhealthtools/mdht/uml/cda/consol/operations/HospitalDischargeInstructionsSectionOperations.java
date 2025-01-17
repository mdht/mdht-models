/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Instructions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeInstructionsSectionOperations extends SectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeInstructionsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeInstructionsSectionTemplateId(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionTemplateId(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.41')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeInstructionsSectionTemplateId(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionTemplateId(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeInstructionsSection The receiving '<em><b>Hospital Discharge Instructions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeInstructionsSectionTemplateId(
			HospitalDischargeInstructionsSection hospitalDischargeInstructionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionTemplateId", "ERROR");

		if (VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalDischargeInstructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionTemplateId"),
						new Object[] { hospitalDischargeInstructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeInstructionsSectionCode(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionCode(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '8653-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeInstructionsSectionCode(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionCode(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeInstructionsSection The receiving '<em><b>Hospital Discharge Instructions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeInstructionsSectionCode(
			HospitalDischargeInstructionsSection hospitalDischargeInstructionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionCode", "ERROR");

		if (VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalDischargeInstructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString(
							"HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionCode"),
						new Object[] { hospitalDischargeInstructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeInstructionsSectionCodeP(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionCodeP(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeInstructionsSectionCodeP(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionCodeP(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeInstructionsSection The receiving '<em><b>Hospital Discharge Instructions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeInstructionsSectionCodeP(
			HospitalDischargeInstructionsSection hospitalDischargeInstructionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionCodeP", "ERROR");

		if (VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalDischargeInstructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionCodeP"),
						new Object[] { hospitalDischargeInstructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeInstructionsSectionTitle(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionTitle(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeInstructionsSectionTitle(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionTitle(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeInstructionsSection The receiving '<em><b>Hospital Discharge Instructions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeInstructionsSectionTitle(
			HospitalDischargeInstructionsSection hospitalDischargeInstructionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionTitle", "ERROR");

		if (VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalDischargeInstructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString(
							"HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionTitle"),
						new Object[] { hospitalDischargeInstructionsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeInstructionsSectionText(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionText(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeInstructionsSectionText(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeInstructionsSectionText(HospitalDischargeInstructionsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeInstructionsSection The receiving '<em><b>Hospital Discharge Instructions Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeInstructionsSectionText(
			HospitalDischargeInstructionsSection hospitalDischargeInstructionsSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionText", "ERROR");

		if (VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalDischargeInstructionsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString(
							"HospitalDischargeInstructionsSectionHospitalDischargeInstructionsSectionText"),
						new Object[] { hospitalDischargeInstructionsSection }));
			}

			return false;
		}
		return true;
	}

} // HospitalDischargeInstructionsSectionOperations
