/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.DerivedCDASection;
import org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Derived CDA Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DerivedCDASection#getEntry1() <em>Get Entry1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedCDASectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DerivedCDASectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #getEntry1(DerivedCDASection) <em>Get Entry1</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(DerivedCDASection)
   * @generated
   * @ordered
   */
  protected static final String GET_ENTRY1__EOCL_EXP = "self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))->asSequence()->any(true).oclAsType(emspcr::DerivedEntry)";

  /**
   * The cached OCL query for the '{@link #getEntry1(DerivedCDASection) <em>Get Entry1</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry1(DerivedCDASection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_ENTRY1__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEntries()->select(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(emspcr::DerivedEntry))->asSequence()->any(true).oclAsType(emspcr::DerivedEntry)
   * @param derivedCDASection The receiving '<em><b>Derived CDA Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DerivedEntry getEntry1(DerivedCDASection derivedCDASection)
  {
    if (GET_ENTRY1__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(EmspcrPackage.Literals.DERIVED_CDA_SECTION, EmspcrPackage.Literals.DERIVED_CDA_SECTION.getEAllOperations().get(55));
      try
      {
        GET_ENTRY1__EOCL_QRY = helper.createQuery(GET_ENTRY1__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ENTRY1__EOCL_QRY);
    return (DerivedEntry) query.evaluate(derivedCDASection);
  }

} // DerivedCDASectionOperations