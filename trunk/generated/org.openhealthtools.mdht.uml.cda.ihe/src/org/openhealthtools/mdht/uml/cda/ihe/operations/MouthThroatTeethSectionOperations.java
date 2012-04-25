/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.MouthThroatTeethSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mouth Throat Teeth Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MouthThroatTeethSection#validateMouthThroatTeethSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MouthThroatTeethSection#validateMouthThroatTeethSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MouthThroatTeethSection#validateMouthThroatTeethSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MouthThroatTeethSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MouthThroatTeethSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MouthThroatTeethSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMouthThroatTeethSectionTemplateId(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMouthThroatTeethSectionTemplateId(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOUTH_THROAT_TEETH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.23')";

	/**
	 * The cached OCL invariant for the '{@link #validateMouthThroatTeethSectionTemplateId(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMouthThroatTeethSectionTemplateId(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOUTH_THROAT_TEETH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.23')
	 * @param mouthThroatTeethSection The receiving '<em><b>Mouth Throat Teeth Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMouthThroatTeethSectionTemplateId(MouthThroatTeethSection mouthThroatTeethSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MOUTH_THROAT_TEETH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MOUTH_THROAT_TEETH_SECTION);
			try {
				VALIDATE_MOUTH_THROAT_TEETH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOUTH_THROAT_TEETH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOUTH_THROAT_TEETH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mouthThroatTeethSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.MOUTH_THROAT_TEETH_SECTION__MOUTH_THROAT_TEETH_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("MouthThroatTeethSectionTemplateId"),
					new Object[] { mouthThroatTeethSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMouthThroatTeethSectionCode(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMouthThroatTeethSectionCode(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOUTH_THROAT_TEETH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '10201-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateMouthThroatTeethSectionCode(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMouthThroatTeethSectionCode(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOUTH_THROAT_TEETH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '10201-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param mouthThroatTeethSection The receiving '<em><b>Mouth Throat Teeth Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMouthThroatTeethSectionCode(MouthThroatTeethSection mouthThroatTeethSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MOUTH_THROAT_TEETH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MOUTH_THROAT_TEETH_SECTION);
			try {
				VALIDATE_MOUTH_THROAT_TEETH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOUTH_THROAT_TEETH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOUTH_THROAT_TEETH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mouthThroatTeethSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.MOUTH_THROAT_TEETH_SECTION__MOUTH_THROAT_TEETH_SECTION_CODE,
					IHEPlugin.INSTANCE.getString("MouthThroatTeethSectionCode"),
					new Object[] { mouthThroatTeethSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMouthThroatTeethSectionProblemEntry(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMouthThroatTeethSectionProblemEntry(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MOUTH_THROAT_TEETH_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::ProblemEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateMouthThroatTeethSectionProblemEntry(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mouth Throat Teeth Section Problem Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMouthThroatTeethSectionProblemEntry(MouthThroatTeethSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MOUTH_THROAT_TEETH_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ihe::ProblemEntry))
	 * @param mouthThroatTeethSection The receiving '<em><b>Mouth Throat Teeth Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMouthThroatTeethSectionProblemEntry(MouthThroatTeethSection mouthThroatTeethSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MOUTH_THROAT_TEETH_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.MOUTH_THROAT_TEETH_SECTION);
			try {
				VALIDATE_MOUTH_THROAT_TEETH_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MOUTH_THROAT_TEETH_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MOUTH_THROAT_TEETH_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mouthThroatTeethSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.MOUTH_THROAT_TEETH_SECTION__MOUTH_THROAT_TEETH_SECTION_PROBLEM_ENTRY,
					IHEPlugin.INSTANCE.getString("MouthThroatTeethSectionProblemEntry"),
					new Object[] { mouthThroatTeethSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemEntry(MouthThroatTeethSection) <em>Get Problem Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(MouthThroatTeethSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_ENTRY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntry))->asSequence()->first().oclAsType(ihe::ProblemEntry)";

	/**
	 * The cached OCL query for the '{@link #getProblemEntry(MouthThroatTeethSection) <em>Get Problem Entry</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemEntry(MouthThroatTeethSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_ENTRY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ihe::ProblemEntry))->asSequence()->first().oclAsType(ihe::ProblemEntry)
	 * @param mouthThroatTeethSection The receiving '<em><b>Mouth Throat Teeth Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static ProblemEntry getProblemEntry(MouthThroatTeethSection mouthThroatTeethSection) {
		if (GET_PROBLEM_ENTRY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.MOUTH_THROAT_TEETH_SECTION,
				IHEPackage.Literals.MOUTH_THROAT_TEETH_SECTION.getEAllOperations().get(58));
			try {
				GET_PROBLEM_ENTRY__EOCL_QRY = helper.createQuery(GET_PROBLEM_ENTRY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_ENTRY__EOCL_QRY);
		return (ProblemEntry) query.evaluate(mouthThroatTeethSection);
	}

} // MouthThroatTeethSectionOperations
