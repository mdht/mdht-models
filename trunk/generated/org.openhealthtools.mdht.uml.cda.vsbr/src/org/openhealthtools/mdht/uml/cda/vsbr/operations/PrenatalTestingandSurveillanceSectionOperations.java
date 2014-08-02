/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prenatal Testingand Surveillance Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionPrenatalCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Prenatal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#getPrenatalCare() <em>Get Prenatal Care</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrenatalTestingandSurveillanceSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrenatalTestingandSurveillanceSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrenatalTestingandSurveillanceSectionTemplateId(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionTemplateId(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.3')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrenatalTestingandSurveillanceSectionTemplateId(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionTemplateId(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prenatalTestingandSurveillanceSection The receiving '<em><b>Prenatal Testingand Surveillance Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrenatalTestingandSurveillanceSectionTemplateId(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION);
			try {
				VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			prenatalTestingandSurveillanceSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"PrenatalTestingandSurveillanceSectionTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									prenatalTestingandSurveillanceSection, context) }),
					new Object[] { prenatalTestingandSurveillanceSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrenatalTestingandSurveillanceSectionClassCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionClassCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

	/**
	 * The cached OCL invariant for the '{@link #validatePrenatalTestingandSurveillanceSectionClassCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionClassCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prenatalTestingandSurveillanceSection The receiving '<em><b>Prenatal Testingand Surveillance Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrenatalTestingandSurveillanceSectionClassCode(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION);
			try {
				VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			prenatalTestingandSurveillanceSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"PrenatalTestingandSurveillanceSectionClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									prenatalTestingandSurveillanceSection, context) }),
					new Object[] { prenatalTestingandSurveillanceSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrenatalTestingandSurveillanceSectionMoodCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionMoodCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePrenatalTestingandSurveillanceSectionMoodCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionMoodCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prenatalTestingandSurveillanceSection The receiving '<em><b>Prenatal Testingand Surveillance Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrenatalTestingandSurveillanceSectionMoodCode(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION);
			try {
				VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			prenatalTestingandSurveillanceSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"PrenatalTestingandSurveillanceSectionMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									prenatalTestingandSurveillanceSection, context) }),
					new Object[] { prenatalTestingandSurveillanceSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrenatalTestingandSurveillanceSectionCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '57078-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrenatalTestingandSurveillanceSectionCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionCode(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prenatalTestingandSurveillanceSection The receiving '<em><b>Prenatal Testingand Surveillance Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrenatalTestingandSurveillanceSectionCode(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION);
			try {
				VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			prenatalTestingandSurveillanceSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"PrenatalTestingandSurveillanceSectionCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									prenatalTestingandSurveillanceSection, context) }),
					new Object[] { prenatalTestingandSurveillanceSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrenatalTestingandSurveillanceSectionText(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionText(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePrenatalTestingandSurveillanceSectionText(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionText(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prenatalTestingandSurveillanceSection The receiving '<em><b>Prenatal Testingand Surveillance Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrenatalTestingandSurveillanceSectionText(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION);
			try {
				VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			prenatalTestingandSurveillanceSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"PrenatalTestingandSurveillanceSectionText",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									prenatalTestingandSurveillanceSection, context) }),
					new Object[] { prenatalTestingandSurveillanceSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrenatalTestingandSurveillanceSectionPrenatalCare(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Prenatal Care</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionPrenatalCare(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Prenatal Care) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePrenatalTestingandSurveillanceSectionPrenatalCare(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Prenatal Care</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrenatalTestingandSurveillanceSectionPrenatalCare(PrenatalTestingandSurveillanceSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param prenatalTestingandSurveillanceSection The receiving '<em><b>Prenatal Testingand Surveillance Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrenatalTestingandSurveillanceSectionPrenatalCare(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION);
			try {
				VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			prenatalTestingandSurveillanceSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION__PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"PrenatalTestingandSurveillanceSectionPrenatalCare",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									prenatalTestingandSurveillanceSection, context) }),
					new Object[] { prenatalTestingandSurveillanceSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPrenatalCare(PrenatalTestingandSurveillanceSection) <em>Get Prenatal Care</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenatalCare(PrenatalTestingandSurveillanceSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRENATAL_CARE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Prenatal Care))->asSequence()->any(true).oclAsType(vsbr::Prenatal Care)";

	/**
	 * The cached OCL query for the '{@link #getPrenatalCare(PrenatalTestingandSurveillanceSection) <em>Get Prenatal Care</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenatalCare(PrenatalTestingandSurveillanceSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRENATAL_CARE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PrenatalCare getPrenatalCare(
			PrenatalTestingandSurveillanceSection prenatalTestingandSurveillanceSection) {
		if (GET_PRENATAL_CARE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION,
				VsbrPackage.Literals.PRENATAL_TESTINGAND_SURVEILLANCE_SECTION.getEAllOperations().get(61));
			try {
				GET_PRENATAL_CARE__EOCL_QRY = helper.createQuery(GET_PRENATAL_CARE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRENATAL_CARE__EOCL_QRY);
		return (PrenatalCare) query.evaluate(prenatalTestingandSurveillanceSection);
	}

} // PrenatalTestingandSurveillanceSectionOperations
