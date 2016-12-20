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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Course Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection#validateHospitalCourseSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalCourseSectionOperations extends SectionOperations {
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
	protected HospitalCourseSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalCourseSectionTemplateId(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionTemplateId(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalCourseSectionTemplateId(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionTemplateId(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalCourseSection The receiving '<em><b>Hospital Course Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalCourseSectionTemplateId(HospitalCourseSection hospitalCourseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_COURSE_SECTION);
			try {
				VALIDATE_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalCourseSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("HospitalCourseSectionHospitalCourseSectionTemplateId"),
						new Object[] { hospitalCourseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalCourseSectionCode(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionCode(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_COURSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '8648-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalCourseSectionCode(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionCode(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_COURSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalCourseSection The receiving '<em><b>Hospital Course Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalCourseSectionCode(HospitalCourseSection hospitalCourseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_COURSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_COURSE_SECTION);
			try {
				VALIDATE_HOSPITAL_COURSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HOSPITAL_COURSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_COURSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hospitalCourseSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("HospitalCourseSectionHospitalCourseSectionCode"),
						new Object[] { hospitalCourseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalCourseSectionCodeP(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionCodeP(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_COURSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalCourseSectionCodeP(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionCodeP(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_COURSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalCourseSection The receiving '<em><b>Hospital Course Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalCourseSectionCodeP(HospitalCourseSection hospitalCourseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_COURSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_COURSE_SECTION);
			try {
				VALIDATE_HOSPITAL_COURSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HOSPITAL_COURSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_COURSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalCourseSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("HospitalCourseSectionHospitalCourseSectionCodeP"),
						new Object[] { hospitalCourseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalCourseSectionTitle(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionTitle(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_COURSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalCourseSectionTitle(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionTitle(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_COURSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalCourseSection The receiving '<em><b>Hospital Course Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalCourseSectionTitle(HospitalCourseSection hospitalCourseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_COURSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_COURSE_SECTION);
			try {
				VALIDATE_HOSPITAL_COURSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HOSPITAL_COURSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_COURSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalCourseSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString("HospitalCourseSectionHospitalCourseSectionTitle"),
						new Object[] { hospitalCourseSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalCourseSectionText(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionText(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_COURSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalCourseSectionText(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Course Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalCourseSectionText(HospitalCourseSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_COURSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalCourseSection The receiving '<em><b>Hospital Course Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalCourseSectionText(HospitalCourseSection hospitalCourseSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_COURSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_COURSE_SECTION);
			try {
				VALIDATE_HOSPITAL_COURSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HOSPITAL_COURSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_COURSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hospitalCourseSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HOSPITAL_COURSE_SECTION__HOSPITAL_COURSE_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("HospitalCourseSectionHospitalCourseSectionText"),
						new Object[] { hospitalCourseSection }));
			}

			return false;
		}
		return true;
	}

} // HospitalCourseSectionOperations
