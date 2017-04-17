/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Copy Right Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection#validateCopyRightSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection#validateCopyRightSectionLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection#validateCopyRightSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection#validateCopyRightSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection#validateCopyRightSectionCopyRightPatternObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Copy Right Pattern Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection#getCopyRightPatternObservations() <em>Get Copy Right Pattern Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyRightSectionOperations extends SectionOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
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
	protected CopyRightSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightSectionTemplateId(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionTemplateId(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.2.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightSectionTemplateId(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionTemplateId(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightSection The receiving '<em><b>Copy Right Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightSectionTemplateId(CopyRightSection copyRightSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_SECTION);
			try {
				VALIDATE_COPY_RIGHT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("CopyRightSectionCopyRightSectionTemplateId"),
						 new Object [] { copyRightSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightSectionLanguageCode(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionLanguageCode(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightSectionLanguageCode(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionLanguageCode(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightSection The receiving '<em><b>Copy Right Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightSectionLanguageCode(CopyRightSection copyRightSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_SECTION);
			try {
				VALIDATE_COPY_RIGHT_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_SECTION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("CopyRightSectionCopyRightSectionLanguageCode"),
						 new Object [] { copyRightSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightSectionText(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionText(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightSectionText(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionText(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightSection The receiving '<em><b>Copy Right Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightSectionText(CopyRightSection copyRightSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_SECTION);
			try {
				VALIDATE_COPY_RIGHT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_TEXT,
						 QFDDPlugin.INSTANCE.getString("CopyRightSectionCopyRightSectionText"),
						 new Object [] { copyRightSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightSectionTitle(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionTitle(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightSectionTitle(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionTitle(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightSection The receiving '<em><b>Copy Right Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightSectionTitle(CopyRightSection copyRightSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_SECTION);
			try {
				VALIDATE_COPY_RIGHT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_TITLE,
						 QFDDPlugin.INSTANCE.getString("CopyRightSectionCopyRightSectionTitle"),
						 new Object [] { copyRightSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightSectionCopyRightPatternObservation(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Copy Right Pattern Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionCopyRightPatternObservation(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_SECTION_COPY_RIGHT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(qfdd::CopyRightPatternObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightSectionCopyRightPatternObservation(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Section Copy Right Pattern Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightSectionCopyRightPatternObservation(CopyRightSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_SECTION_COPY_RIGHT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightSection The receiving '<em><b>Copy Right Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightSectionCopyRightPatternObservation(CopyRightSection copyRightSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_SECTION_COPY_RIGHT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_SECTION);
			try {
				VALIDATE_COPY_RIGHT_SECTION_COPY_RIGHT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_SECTION_COPY_RIGHT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_SECTION_COPY_RIGHT_PATTERN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_SECTION__COPY_RIGHT_SECTION_COPY_RIGHT_PATTERN_OBSERVATION,
						 QFDDPlugin.INSTANCE.getString("CopyRightSectionCopyRightSectionCopyRightPatternObservation"),
						 new Object [] { copyRightSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCopyRightPatternObservations(CopyRightSection) <em>Get Copy Right Pattern Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightPatternObservations(CopyRightSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COPY_RIGHT_PATTERN_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(qfdd::CopyRightPatternObservation)).oclAsType(qfdd::CopyRightPatternObservation)";

	/**
	 * The cached OCL query for the '{@link #getCopyRightPatternObservations(CopyRightSection) <em>Get Copy Right Pattern Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRightPatternObservations(CopyRightSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COPY_RIGHT_PATTERN_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CopyRightPatternObservation> getCopyRightPatternObservations(CopyRightSection copyRightSection) {
	
	
	
		if (GET_COPY_RIGHT_PATTERN_OBSERVATIONS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(QFDDPackage.Literals.COPY_RIGHT_SECTION, QFDDPackage.Literals.COPY_RIGHT_SECTION.getEAllOperations().get(60));
			try {
				GET_COPY_RIGHT_PATTERN_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_COPY_RIGHT_PATTERN_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COPY_RIGHT_PATTERN_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CopyRightPatternObservation> result = (Collection<CopyRightPatternObservation>) query.evaluate(copyRightSection);
		return new BasicEList.UnmodifiableEList<CopyRightPatternObservation>(result.size(), result.toArray());
	}

} // CopyRightSectionOperations
