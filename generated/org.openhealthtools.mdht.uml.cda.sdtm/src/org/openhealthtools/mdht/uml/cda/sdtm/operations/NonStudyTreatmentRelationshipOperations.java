/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Study Treatment Relationship</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship#validateNonStudyTreatmentRelationshipTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship#validateNonStudyTreatmentRelationshipClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship#validateNonStudyTreatmentRelationshipCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship#validateNonStudyTreatmentRelationshipCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship#validateNonStudyTreatmentRelationshipMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonStudyTreatmentRelationship#validateNonStudyTreatmentRelationshipValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonStudyTreatmentRelationshipOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected NonStudyTreatmentRelationshipOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonStudyTreatmentRelationshipTemplateId(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipTemplateId(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.61')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonStudyTreatmentRelationshipTemplateId(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipTemplateId(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonStudyTreatmentRelationship The receiving '<em><b>Non Study Treatment Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonStudyTreatmentRelationshipTemplateId(NonStudyTreatmentRelationship nonStudyTreatmentRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NON_STUDY_TREATMENT_RELATIONSHIP);
			try {
				VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonStudyTreatmentRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NON_STUDY_TREATMENT_RELATIONSHIP__NON_STUDY_TREATMENT_RELATIONSHIP_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonStudyTreatmentRelationshipNonStudyTreatmentRelationshipTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonStudyTreatmentRelationship, context) }),
						 new Object [] { nonStudyTreatmentRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonStudyTreatmentRelationshipClassCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipClassCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateNonStudyTreatmentRelationshipClassCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipClassCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonStudyTreatmentRelationship The receiving '<em><b>Non Study Treatment Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonStudyTreatmentRelationshipClassCode(NonStudyTreatmentRelationship nonStudyTreatmentRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NON_STUDY_TREATMENT_RELATIONSHIP);
			try {
				VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonStudyTreatmentRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NON_STUDY_TREATMENT_RELATIONSHIP__NON_STUDY_TREATMENT_RELATIONSHIP_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonStudyTreatmentRelationshipNonStudyTreatmentRelationshipClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonStudyTreatmentRelationship, context) }),
						 new Object [] { nonStudyTreatmentRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonStudyTreatmentRelationshipCodeP(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipCodeP(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateNonStudyTreatmentRelationshipCodeP(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipCodeP(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonStudyTreatmentRelationship The receiving '<em><b>Non Study Treatment Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonStudyTreatmentRelationshipCodeP(NonStudyTreatmentRelationship nonStudyTreatmentRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NON_STUDY_TREATMENT_RELATIONSHIP);
			try {
				VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonStudyTreatmentRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NON_STUDY_TREATMENT_RELATIONSHIP__NON_STUDY_TREATMENT_RELATIONSHIP_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonStudyTreatmentRelationshipNonStudyTreatmentRelationshipCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonStudyTreatmentRelationship, context) }),
						 new Object [] { nonStudyTreatmentRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonStudyTreatmentRelationshipCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'NSTtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNonStudyTreatmentRelationshipCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonStudyTreatmentRelationship The receiving '<em><b>Non Study Treatment Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonStudyTreatmentRelationshipCode(NonStudyTreatmentRelationship nonStudyTreatmentRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NON_STUDY_TREATMENT_RELATIONSHIP);
			try {
				VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonStudyTreatmentRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NON_STUDY_TREATMENT_RELATIONSHIP__NON_STUDY_TREATMENT_RELATIONSHIP_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonStudyTreatmentRelationshipNonStudyTreatmentRelationshipCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonStudyTreatmentRelationship, context) }),
						 new Object [] { nonStudyTreatmentRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonStudyTreatmentRelationshipMoodCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipMoodCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNonStudyTreatmentRelationshipMoodCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipMoodCode(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonStudyTreatmentRelationship The receiving '<em><b>Non Study Treatment Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonStudyTreatmentRelationshipMoodCode(NonStudyTreatmentRelationship nonStudyTreatmentRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NON_STUDY_TREATMENT_RELATIONSHIP);
			try {
				VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonStudyTreatmentRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NON_STUDY_TREATMENT_RELATIONSHIP__NON_STUDY_TREATMENT_RELATIONSHIP_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonStudyTreatmentRelationshipNonStudyTreatmentRelationshipMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonStudyTreatmentRelationship, context) }),
						 new Object [] { nonStudyTreatmentRelationship }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNonStudyTreatmentRelationshipValue(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipValue(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::ED)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNonStudyTreatmentRelationshipValue(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Study Treatment Relationship Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNonStudyTreatmentRelationshipValue(NonStudyTreatmentRelationship, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param nonStudyTreatmentRelationship The receiving '<em><b>Non Study Treatment Relationship</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateNonStudyTreatmentRelationshipValue(NonStudyTreatmentRelationship nonStudyTreatmentRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.NON_STUDY_TREATMENT_RELATIONSHIP);
			try {
				VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_NON_STUDY_TREATMENT_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(nonStudyTreatmentRelationship)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.NON_STUDY_TREATMENT_RELATIONSHIP__NON_STUDY_TREATMENT_RELATIONSHIP_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "NonStudyTreatmentRelationshipNonStudyTreatmentRelationshipValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(nonStudyTreatmentRelationship, context) }),
						 new Object [] { nonStudyTreatmentRelationship }));
			}
			 
			return false;
		}
		return true;
	}

} // NonStudyTreatmentRelationshipOperations