/**
 */
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
import org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Course Of Care Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection#validateCourseOfCareSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CourseOfCareSectionOperations extends SectionOperations {
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
	protected CourseOfCareSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCourseOfCareSectionTemplateId(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionTemplateId(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COURSE_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.64')";

	/**
	 * The cached OCL invariant for the '{@link #validateCourseOfCareSectionTemplateId(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionTemplateId(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COURSE_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param courseOfCareSection The receiving '<em><b>Course Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCourseOfCareSectionTemplateId(CourseOfCareSection courseOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CourseOfCareSectionCourseOfCareSectionTemplateId", "ERROR");

		if (VALIDATE_COURSE_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COURSE_OF_CARE_SECTION);
			try {
				VALIDATE_COURSE_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_COURSE_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COURSE_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				courseOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COURSE_OF_CARE_SECTION__COURSE_OF_CARE_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("CourseOfCareSectionCourseOfCareSectionTemplateId"),
						new Object[] { courseOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCourseOfCareSectionCode(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionCode(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COURSE_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '8648-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCourseOfCareSectionCode(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionCode(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COURSE_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param courseOfCareSection The receiving '<em><b>Course Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCourseOfCareSectionCode(CourseOfCareSection courseOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CourseOfCareSectionCourseOfCareSectionCode", "ERROR");

		if (VALIDATE_COURSE_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COURSE_OF_CARE_SECTION);
			try {
				VALIDATE_COURSE_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COURSE_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COURSE_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(courseOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COURSE_OF_CARE_SECTION__COURSE_OF_CARE_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("CourseOfCareSectionCourseOfCareSectionCode"),
						new Object[] { courseOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCourseOfCareSectionCodeP(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionCodeP(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COURSE_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCourseOfCareSectionCodeP(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionCodeP(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COURSE_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param courseOfCareSection The receiving '<em><b>Course Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCourseOfCareSectionCodeP(CourseOfCareSection courseOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CourseOfCareSectionCourseOfCareSectionCodeP", "ERROR");

		if (VALIDATE_COURSE_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COURSE_OF_CARE_SECTION);
			try {
				VALIDATE_COURSE_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COURSE_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COURSE_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(courseOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COURSE_OF_CARE_SECTION__COURSE_OF_CARE_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("CourseOfCareSectionCourseOfCareSectionCodeP"),
						new Object[] { courseOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCourseOfCareSectionTitle(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionTitle(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COURSE_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCourseOfCareSectionTitle(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionTitle(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COURSE_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param courseOfCareSection The receiving '<em><b>Course Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCourseOfCareSectionTitle(CourseOfCareSection courseOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CourseOfCareSectionCourseOfCareSectionTitle", "ERROR");

		if (VALIDATE_COURSE_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COURSE_OF_CARE_SECTION);
			try {
				VALIDATE_COURSE_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COURSE_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COURSE_OF_CARE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(courseOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COURSE_OF_CARE_SECTION__COURSE_OF_CARE_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString("CourseOfCareSectionCourseOfCareSectionTitle"),
						new Object[] { courseOfCareSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCourseOfCareSectionText(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionText(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COURSE_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCourseOfCareSectionText(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Course Of Care Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCourseOfCareSectionText(CourseOfCareSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_COURSE_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param courseOfCareSection The receiving '<em><b>Course Of Care Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCourseOfCareSectionText(CourseOfCareSection courseOfCareSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "CourseOfCareSectionCourseOfCareSectionText", "ERROR");

		if (VALIDATE_COURSE_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COURSE_OF_CARE_SECTION);
			try {
				VALIDATE_COURSE_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_COURSE_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_COURSE_OF_CARE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(courseOfCareSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.COURSE_OF_CARE_SECTION__COURSE_OF_CARE_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("CourseOfCareSectionCourseOfCareSectionText"),
						new Object[] { courseOfCareSection }));
			}

			return false;
		}
		return true;
	}

} // CourseOfCareSectionOperations
