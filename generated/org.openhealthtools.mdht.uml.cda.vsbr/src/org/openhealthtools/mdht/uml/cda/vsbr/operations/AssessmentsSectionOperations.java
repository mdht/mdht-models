/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

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

import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessments Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionAssessmentObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Assessment Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#getAssessmentObservations() <em>Get Assessment Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssessmentsSectionOperations extends org.eclipse.mdht.uml.cda.operations.SectionOperations {
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
	protected AssessmentsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentsSectionTemplateId(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionTemplateId(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.9')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentsSectionTemplateId(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionTemplateId(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentsSection The receiving '<em><b>Assessments Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentsSectionTemplateId(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ASSESSMENTS_SECTION);
			try {
				VALIDATE_ASSESSMENTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(assessmentsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AssessmentsSectionAssessmentsSectionTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										assessmentsSection, context) }),
						new Object[] { assessmentsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentsSectionClassCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionClassCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENTS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentsSectionClassCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionClassCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENTS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentsSection The receiving '<em><b>Assessments Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentsSectionClassCode(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENTS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ASSESSMENTS_SECTION);
			try {
				VALIDATE_ASSESSMENTS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENTS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENTS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(assessmentsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AssessmentsSectionAssessmentsSectionClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										assessmentsSection, context) }),
						new Object[] { assessmentsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentsSectionMoodCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionMoodCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENTS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentsSectionMoodCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionMoodCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENTS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentsSection The receiving '<em><b>Assessments Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentsSectionMoodCode(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENTS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ASSESSMENTS_SECTION);
			try {
				VALIDATE_ASSESSMENTS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENTS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENTS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(assessmentsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AssessmentsSectionAssessmentsSectionMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										assessmentsSection, context) }),
						new Object[] { assessmentsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentsSectionCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '51848-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentsSectionCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionCode(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentsSection The receiving '<em><b>Assessments Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentsSectionCode(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ASSESSMENTS_SECTION);
			try {
				VALIDATE_ASSESSMENTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ASSESSMENTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			assessmentsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AssessmentsSectionAssessmentsSectionCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										assessmentsSection, context) }),
						new Object[] { assessmentsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentsSectionCodeP(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionCodeP(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentsSectionCodeP(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionCodeP(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentsSection The receiving '<em><b>Assessments Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentsSectionCodeP(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ASSESSMENTS_SECTION);
			try {
				VALIDATE_ASSESSMENTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(assessmentsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AssessmentsSectionAssessmentsSectionCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										assessmentsSection, context) }),
						new Object[] { assessmentsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentsSectionText(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionText(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentsSectionText(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionText(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentsSection The receiving '<em><b>Assessments Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentsSectionText(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ASSESSMENTS_SECTION);
			try {
				VALIDATE_ASSESSMENTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ASSESSMENTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			assessmentsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_TEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AssessmentsSectionAssessmentsSectionText",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										assessmentsSection, context) }),
						new Object[] { assessmentsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentsSectionTitle(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionTitle(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentsSectionTitle(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionTitle(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentsSection The receiving '<em><b>Assessments Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentsSectionTitle(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ASSESSMENTS_SECTION);
			try {
				VALIDATE_ASSESSMENTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ASSESSMENTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ASSESSMENTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			assessmentsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_TITLE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AssessmentsSectionAssessmentsSectionTitle",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										assessmentsSection, context) }),
						new Object[] { assessmentsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssessmentsSectionAssessmentObservation(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Assessment Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionAssessmentObservation(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::AssessmentObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssessmentsSectionAssessmentObservation(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Assessment Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssessmentsSectionAssessmentObservation(AssessmentsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assessmentsSection The receiving '<em><b>Assessments Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAssessmentsSectionAssessmentObservation(AssessmentsSection assessmentsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.ASSESSMENTS_SECTION);
			try {
				VALIDATE_ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				assessmentsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.ASSESSMENTS_SECTION__ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"AssessmentsSectionAssessmentsSectionAssessmentObservation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										assessmentsSection, context) }),
						new Object[] { assessmentsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentObservations(AssessmentsSection) <em>Get Assessment Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentObservations(AssessmentsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::AssessmentObservation)).oclAsType(vsbr::AssessmentObservation)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentObservations(AssessmentsSection) <em>Get Assessment Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentObservations(AssessmentsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AssessmentObservation> getAssessmentObservations(AssessmentsSection assessmentsSection) {

		if (GET_ASSESSMENT_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.ASSESSMENTS_SECTION,
				VsbrPackage.Literals.ASSESSMENTS_SECTION.getEAllOperations().get(63));
			try {
				GET_ASSESSMENT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSESSMENT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AssessmentObservation> result = (Collection<AssessmentObservation>) query.evaluate(
			assessmentsSection);
		return new BasicEList.UnmodifiableEList<AssessmentObservation>(result.size(), result.toArray());
	}

} // AssessmentsSectionOperations
