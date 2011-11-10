/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>CCD Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection#validateCCDVitalSignsSectionClinicalStatements(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Clinical Statements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection#validateCCDVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection#validateCCDVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection#validateCCDVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection#validateCCDVitalSignsSectionVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CCDVitalSignsSection#getVitalSignsOrganizer() <em>Get Vital Signs Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CCDVitalSignsSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDVitalSignsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCCDVitalSignsSectionClinicalStatements(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Clinical Statements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionClinicalStatements(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CCD_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entry->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateCCDVitalSignsSectionClinicalStatements(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Clinical Statements</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionClinicalStatements(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CCD_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entry->isEmpty()
	 * @param ccdVitalSignsSection The receiving '<em><b>CCD Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCCDVitalSignsSectionClinicalStatements(CCDVitalSignsSection ccdVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CCD_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CCD_VITAL_SIGNS_SECTION);
			try {
				VALIDATE_CCD_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CCD_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CCD_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			ccdVitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CCD_VITAL_SIGNS_SECTION__CCD_VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS,
					ConsolPlugin.INSTANCE.getString("CCDVitalSignsSectionClinicalStatements"),
					new Object[] { ccdVitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCCDVitalSignsSectionTemplateId(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionTemplateId(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CCD_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateCCDVitalSignsSectionTemplateId(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionTemplateId(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CCD_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2.4')
	 * @param ccdVitalSignsSection The receiving '<em><b>CCD Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCCDVitalSignsSectionTemplateId(CCDVitalSignsSection ccdVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CCD_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CCD_VITAL_SIGNS_SECTION);
			try {
				VALIDATE_CCD_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CCD_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CCD_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			ccdVitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CCD_VITAL_SIGNS_SECTION__CCD_VITAL_SIGNS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("CCDVitalSignsSectionTemplateId"),
					new Object[] { ccdVitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCCDVitalSignsSectionCode(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionCode(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CCD_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateCCDVitalSignsSectionCode(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionCode(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CCD_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param ccdVitalSignsSection The receiving '<em><b>CCD Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCCDVitalSignsSectionCode(CCDVitalSignsSection ccdVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CCD_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CCD_VITAL_SIGNS_SECTION);
			try {
				VALIDATE_CCD_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CCD_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CCD_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			ccdVitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CCD_VITAL_SIGNS_SECTION__CCD_VITAL_SIGNS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("CCDVitalSignsSectionCode"), new Object[] { ccdVitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCCDVitalSignsSectionText(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionText(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CCD_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCCDVitalSignsSectionText(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionText(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CCD_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param ccdVitalSignsSection The receiving '<em><b>CCD Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCCDVitalSignsSectionText(CCDVitalSignsSection ccdVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CCD_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CCD_VITAL_SIGNS_SECTION);
			try {
				VALIDATE_CCD_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CCD_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CCD_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			ccdVitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CCD_VITAL_SIGNS_SECTION__CCD_VITAL_SIGNS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("CCDVitalSignsSectionText"), new Object[] { ccdVitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCCDVitalSignsSectionVitalSignsOrganizer(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Vital Signs Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionVitalSignsOrganizer(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CCD_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateCCDVitalSignsSectionVitalSignsOrganizer(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate CCD Vital Signs Section Vital Signs Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCCDVitalSignsSectionVitalSignsOrganizer(CCDVitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CCD_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::VitalSignsOrganizer))
	 * @param ccdVitalSignsSection The receiving '<em><b>CCD Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCCDVitalSignsSectionVitalSignsOrganizer(CCDVitalSignsSection ccdVitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CCD_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CCD_VITAL_SIGNS_SECTION);
			try {
				VALIDATE_CCD_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CCD_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CCD_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			ccdVitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.CCD_VITAL_SIGNS_SECTION__CCD_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER,
					ConsolPlugin.INSTANCE.getString("CCDVitalSignsSectionVitalSignsOrganizer"),
					new Object[] { ccdVitalSignsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsOrganizer(CCDVitalSignsSection) <em>Get Vital Signs Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsOrganizer(CCDVitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::VitalSignsOrganizer))->asSequence()->first().oclAsType(consol::VitalSignsOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsOrganizer(CCDVitalSignsSection) <em>Get Vital Signs Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsOrganizer(CCDVitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::VitalSignsOrganizer))->asSequence()->first().oclAsType(consol::VitalSignsOrganizer)
	 * @param ccdVitalSignsSection The receiving '<em><b>CCD Vital Signs Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static VitalSignsOrganizer getVitalSignsOrganizer(CCDVitalSignsSection ccdVitalSignsSection) {
		if (GET_VITAL_SIGNS_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CCD_VITAL_SIGNS_SECTION,
				ConsolPackage.Literals.CCD_VITAL_SIGNS_SECTION.getEAllOperations().get(60));
			try {
				GET_VITAL_SIGNS_ORGANIZER__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_ORGANIZER__EOCL_QRY);
		return (VitalSignsOrganizer) query.evaluate(ccdVitalSignsSection);
	}

} // CCDVitalSignsSectionOperations
